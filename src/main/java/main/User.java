
package main;

import java.util.Date;

/**
 * What the purpose of the class? 
 *  ** To Create Users for Demonstration of javadoc ** 
 * 
 * Where it is used? 
 *  ** This class is used in Main ** 
 * 
 * @author mohammahomarhariri
 * @version 1.0.0
 */
public class User {
    
    /**
     * JavaDoc on variables depends.... 
     *  if name is not informative do javadoc, otherwise not necessary 
     */
    private String username, password, address, zip;
    private Date creation;

    /**
     * 
     * What is the purpose of this constructor? 
     * ......... 
     * 
     * Where is it used ?
     * ........ 
     *
     * 
     * @param username The name of the user
     * @param password - Password to 
     * @param address - Address Location of User
     * @param zip - Zip location of User
     * @param creation - Time of creation
     */
    public User(String username, String password, String address, String zip, Date creation) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.zip = zip;
        this.creation = creation;
    }

    
    // Getters and Setters are less important
    
    /**
     *
     * @return The Name of this User
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username to be set to this User
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return The Password of this User
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return The address of this User
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address to be set into this User
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return The zip code to this User
     */
    public String getZip() {
        return zip;
    }

    /**
     *
     * @param zip to be set into this User
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     *
     * @return Returns the creation time of this User
     */
    public Date getDate() {
        return creation;
    }

    /**
     *
     * @param date to be set of when the creation of this user occur
     */
    public void setDate(Date date) {
        this.creation = date;
    }
    
}
