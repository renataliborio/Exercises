
public class User {
   private String firstName;
   private String lastName;
   public User(String firstName, String lastName){
      this.firstName = firstName.toUpperCase();
      this.lastName = lastName.toUpperCase();
   }
   public void setFirstName(String firstName) {
      this.firstName = firstName.toUpperCase();
   }
   public String getFirstName() {
      return firstName;
   }
   public void setLastName(String lastName) {
      this.lastName = lastName.toUpperCase();
   }
   public String getLastName() {
      return lastName;
   }
}
