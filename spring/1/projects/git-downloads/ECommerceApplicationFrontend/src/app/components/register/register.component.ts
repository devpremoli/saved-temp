import { Component } from '@angular/core';
import { RegisterService } from '../../services/register.service';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators, FormArray} from '@angular/forms';
import { IUser } from '../../model/interface/IUser';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent {
  registerForm: FormGroup;

  constructor(private registerService: RegisterService, private fb: FormBuilder) {
    this.registerForm = this.fb.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      mobileNumber: ['', [Validators.required, Validators.pattern(/^\d{10}$/)]],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(6)]],
      addresses: this.fb.array([
        this.fb.group({
          street: ['', [Validators.required, Validators.minLength(5)]],
          buildingName: ['', [Validators.required, Validators.minLength(5)]],
          city: ['', [Validators.required, Validators.minLength(4)]],
          state: ['', [Validators.required, Validators.minLength(2)]],
          country: ['', [Validators.required, Validators.minLength(2)]],
          pincode: ['', [Validators.required, Validators.minLength(6)]],
        })
      ])
    });
  }

  get addresses(): FormArray {
    return this.registerForm.get('addresses') as FormArray;
  }

  addAddress(): void {
    this.addresses.push(
      this.fb.group({
        street: ['', [Validators.required, Validators.minLength(5)]],
        buildingName: ['', [Validators.required, Validators.minLength(5)]],
        city: ['', [Validators.required, Validators.minLength(4)]],
        state: ['', [Validators.required, Validators.minLength(2)]],
        country: ['', [Validators.required, Validators.minLength(2)]],
        pincode: ['', [Validators.required, Validators.minLength(6)]],
      })
    );
  }

  removeAddress(index: number): void {
    this.addresses.removeAt(index);
  }


  onSubmit(): void {
    if (this.registerForm.valid) {
      const formData = this.registerForm.value;
  
      const user: IUser = {
        firstName: formData.firstName,
        lastName: formData.lastName,
        email: formData.email,
        password: formData.password,
        mobileNumber: formData.mobileNumber,
        addresses: formData.addresses, // Ensure this maps correctly
        roles: [],
        cart: { cartId: 0, totalPrice: 0, products: [] },
        userId: 0
      };
  
      this.registerService.registerUser(user).subscribe({
        next: (response) => {
          console.log('Registration successful', response);
        },
        error: (err) => {
          console.error('Registration failed', err);
        }
      });
    } else {
      console.error('Form is invalid');
    }
  }
}
