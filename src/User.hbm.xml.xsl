<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE hibernate-mapping PUBLIC
        "-//Hibernate/Hibernate Mapping DTD//EN"
        "http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd">

<hibernate-mapping>
    <class name="login.User" table="Users">
        <meta attribute="class-description">
            This class contains the user role detail.
        </meta>
        <id name="id" type="int" column="UserID">
            <generator class="native"/>
        </id>
        <property name="userName" column="UserName" type="string"/>
        <property name="userRoles" column="RoleName" type="string"/>
        <property name="passWord" column="PassWord" type="string"/>
    </class>
</hibernate-mapping>