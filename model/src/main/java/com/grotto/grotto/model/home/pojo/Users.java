package com.grotto.grotto.model.home.pojo;
// Generated Apr 29, 2015 1:19:13 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users", catalog = "mydb"
)
public class Users  extends AbstractPojo<Users, Integer> implements java.io.Serializable  {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer flatNumber;
    private String email;
    private String userName;
    private String password;
    private String address;
    private String mobileNumber;
    private String longitude;
    private String latitude;
    private Integer floorNum;
    private String uuid;
    private Set<EmergencyList> emergencyLists = new HashSet<EmergencyList>(0);
    private Set<UsersHasNeibours> usersHasNeiboursesForUsersId1 = new HashSet<UsersHasNeibours>(0);
    private Set<UsersHasNeibours> usersHasNeiboursesForUsersId = new HashSet<UsersHasNeibours>(0);
    private Set<UsersHaveHubs> usersHaveHubses = new HashSet<UsersHaveHubs>(0);
    private Set<UsersHasEmergencyList> usersHasEmergencyLists = new HashSet<UsersHasEmergencyList>(0);
    private Set<UsersSentRequest> usersSentRequestsForUsersId1 = new HashSet<UsersSentRequest>(0);
    private Set<UsersSentRequest> usersSentRequestsForUsersId = new HashSet<UsersSentRequest>(0);

    public Users() {
    }

    public Users(String firstName, String lastName, Integer flatNumber, String email, String userName, String password, String address, String mobileNumber, String longitude, String latitude, Integer floorNum, String uuid, Set emergencyLists, Set usersHasNeiboursesForUsersId1, Set usersHasNeiboursesForUsersId, Set usersHaveHubses, Set usersHasEmergencyLists, Set usersSentRequestsForUsersId1, Set usersSentRequestsForUsersId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.flatNumber = flatNumber;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.longitude = longitude;
        this.latitude = latitude;
        this.floorNum = floorNum;
        this.uuid = uuid;
        this.emergencyLists = emergencyLists;
        this.usersHasNeiboursesForUsersId1 = usersHasNeiboursesForUsersId1;
        this.usersHasNeiboursesForUsersId = usersHasNeiboursesForUsersId;
        this.usersHaveHubses = usersHaveHubses;
        this.usersHasEmergencyLists = usersHasEmergencyLists;
        this.usersSentRequestsForUsersId1 = usersSentRequestsForUsersId1;
        this.usersSentRequestsForUsersId = usersSentRequestsForUsersId;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "first_name", length = 45)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", length = 45)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "flat_number")
    public Integer getFlatNumber() {
        return this.flatNumber;
    }

    public void setFlatNumber(Integer flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Column(name = "email", length = 45)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "user_name", length = 45)
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "password", length = 45)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "address", length = 45)
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "mobile_number", length = 45)
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Column(name = "longitude", length = 45)
    public String getLongitude() {
        return this.longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Column(name = "latitude", length = 45)
    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Column(name = "floor_num")
    public Integer getFloorNum() {
        return this.floorNum;
    }

    public void setFloorNum(Integer floorNum) {
        this.floorNum = floorNum;
    }

    @Column(name = "uuid", length = 100)
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
    public Set<EmergencyList> getEmergencyLists() {
        return this.emergencyLists;
    }

    public void setEmergencyLists(Set<EmergencyList> emergencyLists) {
        this.emergencyLists = emergencyLists;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usersByUsersId1")
    public Set<UsersHasNeibours> getUsersHasNeiboursesForUsersId1() {
        return this.usersHasNeiboursesForUsersId1;
    }

    public void setUsersHasNeiboursesForUsersId1(Set<UsersHasNeibours> usersHasNeiboursesForUsersId1) {
        this.usersHasNeiboursesForUsersId1 = usersHasNeiboursesForUsersId1;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usersByUsersId")
    public Set<UsersHasNeibours> getUsersHasNeiboursesForUsersId() {
        return this.usersHasNeiboursesForUsersId;
    }

    public void setUsersHasNeiboursesForUsersId(Set<UsersHasNeibours> usersHasNeiboursesForUsersId) {
        this.usersHasNeiboursesForUsersId = usersHasNeiboursesForUsersId;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
    public Set<UsersHaveHubs> getUsersHaveHubses() {
        return this.usersHaveHubses;
    }

    public void setUsersHaveHubses(Set<UsersHaveHubs> usersHaveHubses) {
        this.usersHaveHubses = usersHaveHubses;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
    public Set<UsersHasEmergencyList> getUsersHasEmergencyLists() {
        return this.usersHasEmergencyLists;
    }

    public void setUsersHasEmergencyLists(Set<UsersHasEmergencyList> usersHasEmergencyLists) {
        this.usersHasEmergencyLists = usersHasEmergencyLists;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usersByUsersId1")
    public Set<UsersSentRequest> getUsersSentRequestsForUsersId1() {
        return this.usersSentRequestsForUsersId1;
    }

    public void setUsersSentRequestsForUsersId1(Set<UsersSentRequest> usersSentRequestsForUsersId1) {
        this.usersSentRequestsForUsersId1 = usersSentRequestsForUsersId1;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usersByUsersId")
    public Set<UsersSentRequest> getUsersSentRequestsForUsersId() {
        return this.usersSentRequestsForUsersId;
    }

    public void setUsersSentRequestsForUsersId(Set<UsersSentRequest> usersSentRequestsForUsersId) {
        this.usersSentRequestsForUsersId = usersSentRequestsForUsersId;
    }

    @Override
    public Integer findID() {
        return getId();
    }

}
