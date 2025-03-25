package za.co.lzinc.aboutme.domain;

import java.lang.module.ModuleDescriptor;
import java.util.Date;

public class AboutMe {
    private String name;
    private String biography;
    private Date birthday;
    private String location;
    private String contact;
    private String email;

    public AboutMe(){

    }

    public AboutMe(String name, String biography, Date birthday, String location, String contact, String email) {
        this.name = name;
        this.biography = biography;
        this.birthday = birthday;
        this.location = location;
        this.contact = contact;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
