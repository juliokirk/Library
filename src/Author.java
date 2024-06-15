/*
 * This software if free to use
 */

/**
 *
 * @author julles
 */

public class Author {
    
    private String firstName;
    private String lastName;
    private String yearOfBirth;
    private String yearOfDeath;
    private String shortBio;

    public Author(String firstName, String lastName, String yearOfBirth, String yearOfDeath){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;    
        this.yearOfDeath = yearOfDeath;    
        this.shortBio = "We still don't have a bio for this author!";    
    }

    /*  Setters */

    public void setShortBio(String shortBio){
        this.shortBio = shortBio;
    }

    public void setYearOfDeath(String yearOfDeath){
        this.yearOfDeath = yearOfDeath;
    }
    

    /*  Getters */
    
    public String getFirstName(String firstName){
        return this.firstName;
    }
    
    public String getLastName(String lastName){
        return this.lastName;
    }
    
    
}
