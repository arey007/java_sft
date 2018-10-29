package ru.stqa.pft.addressbook;

public class ContactData {
  private final String fName;
  private final String mName;
  private final String lName;
  private final String nName;
  private final String hPnone;
  private final String mPhone;

  public ContactData(String fName, String mName, String lName, String nName, String hPnone, String mPhone) {
    this.fName = fName;
    this.mName = mName;
    this.lName = lName;
    this.nName = nName;
    this.hPnone = hPnone;
    this.mPhone = mPhone;
  }

  public String getfName() {
    return fName;
  }

  public String getmName() {
    return mName;
  }

  public String getlName() {
    return lName;
  }

  public String getnName() {
    return nName;
  }

  public String gethPnone() {
    return hPnone;
  }

  public String getmPhone() {
    return mPhone;
  }
}
