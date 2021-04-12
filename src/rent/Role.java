/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rent;

/**
 *
 * @author GhoSter
 */
public class Role {
    int IDRole;
    String RoleName;

    public Role(int IDRole, String RoleName) {
        this.IDRole = IDRole;
        this.RoleName = RoleName;
    }

    @Override
    public String toString() {
        return RoleName;
    }
    
    public int getIDRole() {
        return IDRole;
    }

    public void setIDRole(int Id_vai_tro) {
        this.IDRole = IDRole;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }
    
    
}
