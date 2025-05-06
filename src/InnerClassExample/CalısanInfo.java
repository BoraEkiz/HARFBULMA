package InnerClassExample;

public class CalısanInfo {

    private String ad;
    private String soyad;
    private ContactInfo contactInfo;

    public CalısanInfo(String ad, String soyad, String phone, String email) {
        this.ad = ad;
        this.soyad = soyad;
        this.contactInfo = new ContactInfo(phone, email);
    }




    private class ContactInfo {
        private String phoneNumber;
        private String email;

        // Constructor
        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        // İletişim bilgilerini yazdıran metot
        public void displayContactInfo() {
            System.out.println("Telefon: " + phoneNumber);
            System.out.println("E-posta: " + email);
        }

    }




        public void displayEmployeeInfo() {
            System.out.println("Çalışan: " + ad + " " + soyad);
            contactInfo.displayContactInfo(); // İç sınıftan çağrı
        }
    }

