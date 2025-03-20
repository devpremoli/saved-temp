import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { AuthorService } from '../author.service';

@Component({
  selector: 'app-author-list',
  standalone: true,
  templateUrl: './author-list.component.html',
  styleUrls: ['./author-list.component.css'],
})
export class AuthorListComponent implements OnInit {
  displayedColumns: string[] = ['id', 'name'];
  dataSource = new MatTableDataSource<any>();

  constructor(private authorService: AuthorService) {}

  ngOnInit(): void {
    // Fetch authors data from the API when the component initializes
    this.authorService.getAuthors().subscribe((data: any[]) => {
      this.dataSource.data = data;
    });
  }
}
