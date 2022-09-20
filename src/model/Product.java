/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author deep
 */
public class Product {
    private String fName, lName;
    private String TeleNumber, Email; 
    private String DOB, age;
    private String Degree1, Degree1StartDate, Degree1EndDate;
    private String Degree2, Degree2StartDate, Degree2EndDate;
    private String Affiliation, Major, Career;
    private String SendPath;

    public String getSendPath() {
        return SendPath;
    }

    public void setSendPath(String SendPath) {
        this.SendPath = SendPath;
    }
    private String BrowsedImgPath;

    public String getBrowsedImgPath() {
        return BrowsedImgPath;
    }

    public void setBrowsedImgPath(String BrowsedImgPath) {
        this.BrowsedImgPath = BrowsedImgPath;
    }
    
    public String img_path;

    public String getDegree1() {
        return Degree1;
    }

    public void setDegree1(String Degree1) {
        this.Degree1 = Degree1;
    }

    public String getDegree1StartDate() {
        return Degree1StartDate;
    }

    public void setDegree1StartDate(String Degree1StartDate) {
        this.Degree1StartDate = Degree1StartDate;
    }

    public String getDegree1EndDate() {
        return Degree1EndDate;
    }

    public void setDegree1EndDate(String Degree1EndDate) {
        this.Degree1EndDate = Degree1EndDate;
    }

    public String getDegree2() {
        return Degree2;
    }

    public void setDegree2(String Degree2) {
        this.Degree2 = Degree2;
    }

    public String getDegree2StartDate() {
        return Degree2StartDate;
    }

    public void setDegree2StartDate(String DEgree2StartDate) {
        this.Degree2StartDate = DEgree2StartDate;
    }

    public String getDegree2EndDate() {
        return Degree2EndDate;
    }

    public void setDegree2EndDate(String Degree2EndDate) {
        this.Degree2EndDate = Degree2EndDate;
    }

    public String getAffiliation() {
        return Affiliation;
    }

    public void setAffiliation(String Affiliation) {
        this.Affiliation = Affiliation;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public String getCareer() {
        return Career;
    }

    public void setCareer(String Career) {
        this.Career = Career;
    }

    public String getTeleNumber() {
        return TeleNumber;
    }

    public void setTeleNumber(String TeleNumber) {
        this.TeleNumber = TeleNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getStreetLine1() {
        return StreetLine1;
    }

    public void setStreetLine1(String StreetLine1) {
        this.StreetLine1 = StreetLine1;
    }

    public String getStreetLine2() {
        return StreetLine2;
    }

    public void setStreetLine2(String StreetLine2) {
        this.StreetLine2 = StreetLine2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }
    private String StreetLine1, StreetLine2, City, Country;
    

  

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
}
