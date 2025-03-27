package za.ac.cput.domain;

public class Seller {

    private int orderId;
    public String sellerName;
    public int sellerAge;
    public String contactNumber;
    public String userName;
    public String password;

    private Seller() {
    }

    public String getSellerName() {
        return sellerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public int getSellerAge() {
        return sellerAge;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "orderId=" + orderId +
                ", SellerName='" + sellerName + '\'' +
                ", SellerAge=" + sellerAge +
                ", contactNumber='" + contactNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private Seller(Builder builder) {
        this.sellerName = builder.sellerName;
        this.sellerAge = builder.sellerAge;
        this.contactNumber = builder.contactNumber;
        this.userName = builder.userName;
        this.password = builder.password;
        this.orderId = builder.orderId;
    }
    public static class Builder {
        private int orderId;
        private String sellerName;
        private int sellerAge;
        private String contactNumber;
        private String userName;
        private String password;

        public Builder setOrderId(int orderId) {
        this.orderId = orderId;
        return this;
    }

    public Builder setSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }

    public Builder setSellerAge(int sellerAge) {
        this.sellerAge = sellerAge;
        return this;
    }

    public Builder setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }

    public Builder setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public Builder setPassword(String password) {
        this.password = password;
        return this;
    }

    public Seller build() {
        return new Seller(this);
    }


}
}
