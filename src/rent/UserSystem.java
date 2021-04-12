
package rent;


public class UserSystem {

    int IDUser;
    int IDRole;
    String username;
    String address;
    String phone_no;
    String Email;
    String gender;
    String Fullname;
    String password;

    public UserSystem(int IDUser,int IDRole, String username, String password,String Fullname , String gender, String address, String phone_no, String Email) {
        this.IDUser = IDUser;
        this.IDRole = IDRole;
        this.username = username;
        this.address = address;
        this.phone_no = phone_no;
        this.Email = Email;
        this.gender = gender;
        this.Fullname = Fullname;
        this.password = password;
    }

    public int getIDRole() {
        return IDRole;
    }

    public void setIDRole(int Id_vai_tro) {
        this.IDRole = IDRole;
    }

    @Override
    public String toString() {
        return username;
    }

    public int getIDUser() {
        return IDUser;
    }

    public void setIDUser(int Maqt) {
        this.IDUser = IDUser;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String Diachi) {
        this.address = address;
    }

    public String getphone_no() {
        return phone_no;
    }

    public void setphone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Tendn) {
        this.Fullname = Fullname;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String Matkhau) {
        this.password = password;
    }
}
