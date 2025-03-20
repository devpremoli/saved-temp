// File: src/app/models/classes/Role.ts
import { IRole } from '../interface/IRole';

export class Role implements IRole {
  roleId: number;
  roleName: string;

  constructor(roleId: number, roleName: string) {
    this.roleId = roleId;
    this.roleName = roleName;
  }
}
