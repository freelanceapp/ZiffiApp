package apporio.com.ziffiapp.Api_Manage;

/**
 * Created by apporio3 on 9/17/2016.
 */
public class ViewStrore_settergetter {


    /**
     * result : 1
     * Details : {"time":"10:00 AM to 8:00 PM","image":"","telephone":"123456789","email":"admin@admin.com","address":"salon-appointment-booking","name":"salon-appointment-booking"}
     */

    private int result;
    /**
     * time : 10:00 AM to 8:00 PM
     * image :
     * telephone : 123456789
     * email : admin@admin.com
     * address : salon-appointment-booking
     * name : salon-appointment-booking
     */

    private DetailsBean Details;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public DetailsBean getDetails() {
        return Details;
    }

    public void setDetails(DetailsBean Details) {
        this.Details = Details;
    }

    public static class DetailsBean {
        private String time;
        private String image;
        private String telephone;
        private String email;
        private String address;
        private String name;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTelephone() {
            return telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
