package nursing_Page_Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import common_Functions_Web.WebBrowser;
import common_Functions_Web.WebButton;
import common_Functions_Web.WebTextBox;
import nursing_Page_Locators.New_Patient_Admission_Locator;
import nursing_Page_Locators.NursingDemoOne_Page_Locator;

public class New_Patient_Admission_Action {
	public WebDriver driver = null;
	public ExtentTest logger = null;
	public New_Patient_Admission_Locator patientDetailsPL = null;
	
	public New_Patient_Admission_Action(WebDriver driver ,ExtentTest logger){
		this.driver = driver;
		this.logger = logger;
		patientDetailsPL = new New_Patient_Admission_Locator(driver);
	}
	
	public void clickPatientMgnt(){
		WebButton.click(patientDetailsPL.clkPatientMgnt(),logger);
	}
	
	public void clickPatientRegi(){
		WebButton.click(patientDetailsPL.clkPatientMgnt(),logger);
	}
	public boolean validatePageTitle(String expectedTitle){
		return WebBrowser.titleVerification(driver, expectedTitle,logger);
	}
	
	public void patient_UHID(String patient_UHID){
		WebElement userName = patientDetailsPL.getUHIDId();
		WebTextBox.sendInput(userName, patient_UHID, logger);
		//WebTextBox.sendInput(WebWait.webElementClickable(driver, userName),user, logger);
	}
	public void patient_Name(String name){
		WebTextBox.sendInput(patientDetailsPL.getPatienName(), name, logger);
	}
	public void patient_Age(String age){
		WebTextBox.sendInput(patientDetailsPL.getPatientAge(), age, logger);
	}
	public void birthDate(String date){
		WebTextBox.sendInput(patientDetailsPL.getBirthDate(), date, logger);
	}
	public void gender(String gender){
		WebTextBox.sendInput(patientDetailsPL.getGender(), gender, logger);
	}
	public void religion(String relision){
		WebTextBox.sendInput(patientDetailsPL.getReligion(), relision, logger);
	}
	public void nationality(String nationality){
		WebTextBox.sendInput(patientDetailsPL.getNationality(), nationality, logger);
	}
	public void guardian(String guardian){
		WebTextBox.sendInput(patientDetailsPL.getGuardian(), guardian, logger);
	}
	public void relation_With_Guardian(String relwithGuardian){
		WebTextBox.sendInput(patientDetailsPL.getRelation_With_Guardian(), relwithGuardian, logger);
	}
	public void marital_Status(String maritalStatus){
		WebTextBox.sendInput(patientDetailsPL.getMarital_Status(), maritalStatus, logger);
	}
	public void contact_No(String contactNo){
		WebTextBox.sendInput(patientDetailsPL.getContact_No(), contactNo, logger);
	}
	public void alt_Contact_No(String altContNo){
		WebTextBox.sendInput(patientDetailsPL.getAlt_Contact_No(), altContNo, logger);
	}
	public void address(String address){
		WebTextBox.sendInput(patientDetailsPL.getAddress(), address, logger);
	}
	public void district(String district){
		WebTextBox.sendInput(patientDetailsPL.getDistrict(), district, logger);
	}
	public void pincode(String pincode){
		WebTextBox.sendInput(patientDetailsPL.getPincode(), pincode, logger);
	}
	public void police_Station(String policeStation){
		WebTextBox.sendInput(patientDetailsPL.getPolice_Station(), policeStation, logger);
	}
	public void post_Office(String postOffice){
		WebTextBox.sendInput(patientDetailsPL.getPost_Office(), postOffice, logger);
	}
	public void weight(String weight){
		WebTextBox.sendInput(patientDetailsPL.getWeight(), weight, logger);
	}
	public void height(String height){
		WebTextBox.sendInput(patientDetailsPL.getHeight(), height, logger);
	}
	public void blood_Pressure(String bp){
		WebTextBox.sendInput(patientDetailsPL.getBlood_Pressure(), bp, logger);
	}
	public void pulseRate(String pr){
		WebTextBox.sendInput(patientDetailsPL.getPulseRate(), pr, logger);
	}
	public void spO2(String sp){
		WebTextBox.sendInput(patientDetailsPL.getSpO2(), sp, logger);
	}
	public void prov_Diagnosis(String prDia){
		WebTextBox.sendInput(patientDetailsPL.getProv_Diagnosis(), prDia, logger);
	}
	public void insurence_Company(String insuComp){
		WebTextBox.sendInput(patientDetailsPL.getInsurence_Company(), insuComp, logger);
	}
	public void select_TPA(String tpa){
		WebTextBox.sendInput(patientDetailsPL.getSelect_TPA(), tpa, logger);
	}
	public void claim_Number(String claimNumber){
		WebTextBox.sendInput(patientDetailsPL.getClaim_Number(), claimNumber, logger);
	}
	public void policy_No(String poNo){
		WebTextBox.sendInput(patientDetailsPL.getPolicy_No(), poNo, logger);
	}
	public void admission_Date(String admissionDate){
		WebTextBox.sendInput(patientDetailsPL.getAdmission_Date(), admissionDate, logger);
	}
	public void referred_By(String reBy){
		WebTextBox.sendInput(patientDetailsPL.getReferred_By(), reBy, logger);
	}
	public void Under_Doctor(String underDr){
		WebTextBox.sendInput(patientDetailsPL.getUnder_Doctor(), underDr, logger);
	}
	public void patient_case(String patientCase){
		WebTextBox.sendInput(patientDetailsPL.getCase(), patientCase, logger);
	}
	public void fIR_No(String firNo){
		WebTextBox.sendInput(patientDetailsPL.getFIR_No(), firNo, logger);
	}
	public void room(String room){
		WebTextBox.sendInput(patientDetailsPL.getRoom(), room, logger);
	}
	public void bed(String bed){
		WebTextBox.sendInput(patientDetailsPL.getBed(), bed, logger);
	}
	
	public void verifyPage(String verifyPage){
		WebBrowser.verify_Page(driver, verifyPage,logger);
	}
	public void addPatient(){
		WebTextBox.click(patientDetailsPL.addPatient(), logger);
	}
	
	public void newPatientAdmissionProcess(String title, String patient_UHID, String name,String age,
			String date,String gender,String relision,String nationality,String guardian,
			String relwithGuardian,String maritalStatus,String contactNo,String altContNo,
			String address,String district,String pincode,String policeStation,String postOffice,
			String weight,String height,String bp,String pr,String sp,String prDia,
			String insuComp,String tpa,String claimNumber,String poNo,String admissionDate,
			String reBy,String underDr,String patientCase,String firNo,String room,String bed
			) {
		if(validatePageTitle(title)){
			clickPatientMgnt();
			clickPatientRegi();
			patient_UHID(patient_UHID);
			patient_Name(name);
			patient_Age(age);
			birthDate(date);
			gender(gender);
			religion(relision);
			nationality(nationality);
			guardian(guardian);
			relation_With_Guardian(relwithGuardian);
			marital_Status(maritalStatus);
			contact_No(contactNo);
			alt_Contact_No(altContNo);
			address(address);
			district(district);
			pincode(pincode);
			police_Station(policeStation);
			post_Office(postOffice);
			weight(weight);
			height(height);
			blood_Pressure(bp);
			pulseRate(pr);
			spO2(sp);
			prov_Diagnosis(prDia);
			insurence_Company(insuComp);
			select_TPA(tpa);
			claim_Number(claimNumber);
			policy_No(poNo);
			admission_Date(admissionDate);
			referred_By(reBy);
			Under_Doctor(underDr);
			patient_case(patientCase);
			fIR_No(firNo);
			room(room);
			bed(bed);
			addPatient();
			//verifyPage(verifyPage);
		
			
		}
		else{
			logger.log(LogStatus.FAIL, "Title does not match for registation page one");
		}
	}

}
