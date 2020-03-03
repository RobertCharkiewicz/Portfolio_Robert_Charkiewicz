package Lekcja12_zadanie_Selenium;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Selenium_NewUser_Lombok {
    @Builder.Default
    String email = "email@abc.com";
    @Builder.Default
    String passwd = "ABC1xyz!";
    @Builder.Default
    String name = "Jan";
    @Builder.Default
    String lastName = "Kowalski";
    @Builder.Default
    String address = "adress";
    @Builder.Default
    String address2 = "address2";
    @Builder.Default
    String city = "city";
    @Builder.Default
    String state = "Alabama";
    @Builder.Default
    String postCode = "12345";
    @Builder.Default
    String country = "Poland";
    @Builder.Default
    String homeNo = "123456789";
    @Builder.Default
    String mobileNo = "987654321";
    @Builder.Default
    String addressAlias = "addressAlias";
}