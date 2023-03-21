package com.psuti.Popko.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users_users_group", schema = "public", catalog = "Popko")
public class UsersUsersGroupEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "users_id")
    private int usersId;
    @Basic
    @Column(name = "users_group_id")
    private int usersGroupId;

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    public int getUsersGroupId() {
        return usersGroupId;
    }

    public void setUsersGroupId(int usersGroupId) {
        this.usersGroupId = usersGroupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersUsersGroupEntity that = (UsersUsersGroupEntity) o;
        return usersId == that.usersId && usersGroupId == that.usersGroupId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(usersId, usersGroupId);
    }
}
