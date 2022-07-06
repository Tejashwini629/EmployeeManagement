package com.wecodee.EmployeeManagement.constant;

public enum ResponseMessage {
	
	// Login Messages
		LOGIN_SUCCESS("Login Successfull"),
		LOGIN_FAILED("Login Failed"),
		INVALID_CREDENTIALS("Invalid Credentials"),
		USER_NOT_FOUND("User Id not found"),
		USER_NOT_APPROVED("User not Approved"),
		USER_LOCKED("User is Locked"),
		USER_DISABLED("User Id is disabled. Please contact your system administrator"),
		PASSWORD_UPDATE_SUCCESS("Password Updated Successfully"),
		PASSWORD_UPDATE_FAILED("Failed to Update Password"),
		PASSWORD_MISMATCH("Existing Password is wrong"),
		INVALID_USER("Invalid User Id"),
		RESET_PASSWORD_SUCCESS("Auto Generated Password sent to Registered Email Id"),
		RESET_PASSWORD_FAILED("Failed to Reset Password"),
		USER_EMAIL_MISMATCH("User Id and Registered Email Id does not match"),
	    NEW_ACCOUNT_FAILED_CREATION("Failed to send email for new account creation"),
	    NEW_ACCOUNT_FAILED_APPROVED("Failed to send email for new account approval to approver"),
	    NEW_ACCOUNT_FAILED_REJECTED("Failed to send email for new account rejected to approver"),
	    NEW_ACCOUNT_FAILED_REJECTED_CREATOR("Failed to send email for new account rejected to creator"),
	    NEW_ACCOUNT_FAILED_CREATOR("Failed to send email for new account approval to creator"),
	    FAILED_TO_FETCH_CUSTOMER("Failed to fetch customers"),
	    FAILED_TO_QUERY_CUSTOMER("Failed to query the customer from fcubs"),

		// User Messages
		USER_CREATED("User Created"), USER_UPDATED("User Updated"), USER_APPROVED("User Approved"),
		USER_EXISTS("User Already Exists"), USER_DELETED("User deleted"),
		USER_UNLOCKED_SUCCESS("User unlocked successfully.by default it will 'password' "),
		USER_UNLOCKED_FAILED("Failed to unlock the user"),

		// Role Messages
		ROLE_CREATED("Role Created"), ROLE_UPDATED("Role Updated"), ROLE_APPROVED("Role Approved"),
		ROLE_EXISTS("Role Already Exists"), ROLE_DELETED("Role deleted"),

		// Application Properties Messages
		PROPERTIES_MODIFIED("Properties Modified"), PROPERTIES_APPROVED("Properties Approved"),

		// Email Configuration Messages
		EMAILCONFIG_MODIFIED("Email Configuration Modified"),
		EMAILCONFIG_APPROVED("Email Configuration Changes Approved"),
		EMAILCONFIG_REJECTED("Email Configuration Changes Rejected"),

		// SMS Configuration Messages
		SMS_MODIFIED("SMS Configuration Modified"),
		SMSCONFIG_APPROVED("SMS Configuration Changes Approved"),
		SMSCONFIG_REJECTED("SMS Configuration Changes Rejected"),

		// Job Monitoring Messages
		JOB_STARTED("Job Started"),
		JOB_STOPPED("Job Stopped"),

		// Common Messages
		OPERATION_SUCCESS("Operation Success"),
		OPERATION_FAILED("Operation Failed"),
		DELETED("Deleted"),
		USER_ALREADY_EXISTS("Already exists"),
		ROLE_ALREADY_EXISTS("Role already exists"),
		CUSTOMER_ALREADY_EXISTS("Customer already exists"),
		GROUP_ALREADY_EXISTS("Group already exists"),
		EMAIL_TEMPLATE_ALREADY_EXISTS("Email template already exists"),
		SMS_TEMPLATE_ALREADY_EXISTS("SMS template already exists"),
		APPLICATION_SAVED_AS_DRAFT("Application saved as draft successfully"),
		RECORD_REJECTED("Record Rejected Successfully"),
		RECORD_APPROVED("Record Approved Successfully"),

		
		//Validation message
		//1.USER
		ACCESS_NOT_AVAILABLE_FOR_CREATE_USER("Sorry! you do not have an access to create a new user"),
		ACCESS_NOT_AVAILABLE_FOR_APPROVE_USER("Sorry! you do not have an access to approve"),
		ACCESS_NOT_AVAILABLE_FOR_UPDATE_USER("Sorry! you do not have an access to update"),
		ACCESS_NOT_AVAIALABLE_FOR_DISABLE_USER("Sorry! you do not have an access to disable the user"),
		ACCESS_NOT_AVAILABLE_FOR_REJECT_USER("Sorry! you do not have an access to reject the user"),
		ACCESS_NOT_AVAILABLE_FOR_DELETE_USER("Sorry! you do not have an access to delete the user"),
		ACCESS_NOT_AVAILABLE_FOR_VIEW_USER("Sorry! you do not have an access to view the user"),
		
		//2.ROLE
		ACCESS_NOT_AVAILABLE_FOR_CREATE_ROLE("Sorry! you do not have an access to create a new role"),
		ACCESS_NOT_AVAILABLE_FOR_APPROVE_ROLE("Sorry! you do not have an access to approve a role"),
		ACCESS_NOT_AVAILABLE_FOR_UPDATE_ROLE("Sorry! you do not have an access to update a role"),
		ACCESS_NOT_AVAIALABLE_FOR_DISABLE_ROLE("Sorry! you do not have an access to disable the role"),
		ACCESS_NOT_AVAILABLE_FOR_REJECT_ROLE("Sorry! you do not have an access to reject the role"),
		ACCESS_NOT_AVAILABLE_FOR_DELETE_ROLE("Sorry! you do not have an access to delete the role"),
		ACCESS_NOT_AVAILABLE_FOR_VIEW_ROLE("Sorry! you do not have an access to view the role"),
		
		//3.CREATE ACCOUNT
		ACCESS_NOT_AVAILABLE_FOR_CREATE_ACCOUNT("Sorry! you do not have an access to create a new customer"),
		ACCESS_NOT_AVAILABLE_FOR_UPDATE_ACCOUNT("Sorry! you do not have an access to update customer"),
		ACCESS_NOT_AVAILABLE_FOR_APPROVE_ACCOUNT("Sorry! you do not have an access to approve this application"),
		ACCESS_NOT_AVAILABLE_FOR_REJECT_ACCOUNT("Sorry! you do not have an access to reject customer"),
		ACCESS_NOT_AVAILABLE_FOR_DISABLE_ACCOUNT("Sorry! you do not have an access to disable customer"),
		ACCESS_NOT_AVAILABLE_FOR_DELETE_ACCOUNT("Sorry you do not have an access to delete customer"),
		ACCESS_NOT_AVAILABLE_FOR_VIEW_ACCOUNT("Sorry! you do not have an access to view the customer"),

		//4.EMAIL TEMPLATE
		ACCESS_NOT_AVAILABLE_FOR_CREATE_EMAILTEMPLATE("Sorry! you do not have an access to create a new email template"),
		ACCESS_NOT_AVAILABLE_FOR_UPDATE_EMAILTEMPLATE("Sorry! you do not have an access to update a email template"),
		ACCESS_NOT_AVAILABLE_FOR_APPROVE_EMAILTEMPLATE("Sorry! you do not have an access to approve a email template"),
		ACCESS_NOT_AVAILABLE_FOR_REJECT_EMAILTEMPLATE("Sorry! you do not have an access to reject a email template"),
		ACCESS_NOT_AVAILABLE_FOR_DISABLE_EMAILTEMPLATE("Sorry! you do not have an access to disable a email template"),
		ACCESS_NOT_AVAILABLE_FOR_DELETE_EMAILTEMPLATE("Sorry! you do not have an access to delete a email template"),
		ACCESS_NOT_AVAILABLE_FOR_VIEW_EMAILTEMPLATE("Sorry! you do not have an access to view a email template"),

		//5.SMS TEMPLATE
		ACCESS_NOT_AVAIALABLE_FOR_CREATE_SMSTEMPLATE("Sorry! you do not have an access to create a new sms template"),
		ACCESS_NOT_AVAIALABLE_FOR_UPDATE_SMSTEMPLATE("Sorry! you do not have an access to update a sms template"),
		ACCESS_NOT_AVAIALABLE_FOR_APPROVE_SMSTEMPLATE("Sorry! you do not have an access to approve a sms template"),
		ACCESS_NOT_AVAIALABLE_FOR_REJECT_SMSTEMPLATE("Sorry! you do not have an access to reject a sms template"),
		ACCESS_NOT_AVAIALABLE_FOR_DISABLE_SMSTEMPLATE("Sorry! you do not have an access to disable a sms template"),
		ACCESS_NOT_AVAIALABLE_FOR_DELETE_SMSTEMPLATE("Sorry! you do not have an access to delete a sms template"),
		ACCESS_NOT_AVAILABLE_FOR_VIEW_SMSTEMPLATE("Sorry! you do not have an access to view a sms template"),
		
		//6.DOCUMENT CHECKLIST
		ACCESS_NOT_AVAIALABLE_FOR_CREATE_CHECKLIST("Sorry! you do not have an access to create a new checklist"),
		ACCESS_NOT_AVAIALABLE_FOR_UPDATE_CHECKLIST("Sorry! you do not have an access to update a checklist"),
		ACCESS_NOT_AVAIALABLE_FOR_APPROVE_CHECKLIST("Sorry! you do not have an access to approve a checklist"),
		ACCESS_NOT_AVAIALABLE_FOR_REJECT_CHECKLIST("Sorry! you do not have an access to reject a checklist"),
		ACCESS_NOT_AVAIALABLE_FOR_DISABLE_CHECKLIST("Sorry! you do not have an access to disable a checklist"),
		ACCESS_NOT_AVAIALABLE_FOR_DELETE_CHECKLIST("Sorry! you do not have an access to delete a checklist"),
		ACCESS_NOT_AVAILABLE_FOR_VIEW_CHECKLIST("Sorry! you do not have an access to view a checklist"),
		
		//7.TRANSACTION LIMITS
		ACCESS_NOT_AVAIALABLE_FOR_CREATE_TRXN_LIMIT("Sorry! you do not have an access to create a new transaction limit"),
		ACCESS_NOT_AVAIALABLE_FOR_UPDATE_TRXN_LIMIT("Sorry! you do not have an access to update a transaction limit"),
		ACCESS_NOT_AVAIALABLE_FOR_APPROVE_TRXN_LIMIT("Sorry! you do not have an access to approve a transaction limit"),
		ACCESS_NOT_AVAIALABLE_FOR_REJECT_TRXN_LIMIT("Sorry! you do not have an access to reject a transaction limit"),
		ACCESS_NOT_AVAIALABLE_FOR_DISABLE_TRXN_LIMIT("Sorry! you do not have an access to disable a transaction limit"),
		ACCESS_NOT_AVAIALABLE_FOR_DELETE_TRXN_LIMIT("Sorry! you do not have an access to delete a transaction limit"),
		ACCESS_NOT_AVAILABLE_FOR_VIEW_TRXN_LIMIT("Sorry! you do not have an access to view a transaction limit"),
		
		//8.EMAIL
		ACCESS_NOT_AVAILABLE_FOR_UPDATE_EMAIL_CONFIG("Sorry! you do not have an access to update a email configuration"),
		ACCESS_NOT_AVAILABLE_FOR_APPROVE_EMAIL_CONFIG("Sorry! you do not have an access to approve a email configuration"),
		ACCESS_NOT_AVAILABLE_FOR_REJECT_EMAIL_CONFIG("Sorry! you do not have an access to reject a email configuration"),
		ACCESS_NOT_AVAILABLE_FOR_VIEW_EMAIL_CONFIG("Sorry! you do not have an access to view a email configuration"),
		
		//9.SMS
		ACCESS_NOT_AVAILABLE_FOR_UPDATE_SMS_CONFIG("Sorry! you do not have an access to update a sms configuration"),
		ACCESS_NOT_AVAILABLE_FOR_APPROVE_SMS_CONFIG("Sorry! you do not have an access to approve a sms configuration"),
		ACCESS_NOT_AVAILABLE_FOR_REJECT_SMS_CONFIG("Sorry! you do not have an access to reject a sms configuration"),
		ACCESS_NOT_AVAILABLE_FOR_VIEW_SMS_CONFIG("Sorry! you do not have an access to view a sms configuration"),

		//10.SECURITY PARAMETERS
		ACCESS_NOT_AVAIALABLE_FOR_CREATE_SECURITY_PARAMETER("Sorry! you do not have an access to create a new security parameter"),
		ACCESS_NOT_AVAIALABLE_FOR_UPDATE_SECURITY_PARAMETER("Sorry! you do not have an access to update a security parameter"),
		ACCESS_NOT_AVAIALABLE_FOR_APPROVE_SECURITY_PARAMETER("Sorry! you do not have an access to approve a security parameter"),
		ACCESS_NOT_AVAIALABLE_FOR_REJECT_SECURITY_PARAMETER("Sorry! you do not have an access to reject a security parameter"),
		ACCESS_NOT_AVAIALABLE_FOR_DISABLE_SECURITY_PARAMETER("Sorry! you do not have an access to disable a security parameter"),
		ACCESS_NOT_AVAIALABLE_FOR_DELETE_SECURITY_PARAMETER("Sorry! you do not have an access to delete a security parameter"),
		ACCESS_NOT_AVAILABLE_FOR_VIEW_SECURITY_PARAMETER("Sorry! you do not have an access to view a security parameter"),

		//11.LOOKUP
		ACCESS_NOT_AVAILABLE_FOR_VIEW_LOOKUP("Sorry! you do not have an access to view the user"),
		ACCESS_NOT_AVAILABLE_FOR_APPROVE_LOOKUP("Sorry! you do not have an access to approve"),
		ACCESS_NOT_AVAILABLE_FOR_UPDATE_LOOKUP("Sorry! you do not have an access to update"),
		ACCESS_NOT_AVAILABLE_FOR_REJECT_LOOKUP("Sorry! you do not have an access to reject the lookup"),

		FETCH_SUCCESS("Records Fetched Successfully"), NO_RECORDS_FOUND("No records found"),
		FETCH_FAILED("Failed to fetch records"),

		DELETE_SUCCESS("Record deleted successfully"),
		DELETE_FAILED("Record cannot be deleted"),
		APPROVED("Approved successfully"),
		REJECTED("Rejected"),
		INVALID_ACCESS("Invalid Access"), INVALID_DATA("Invalid Date sending to fcubs"),

		CREATE_FAILED("Failed to Save the record"), UPDATE_FAILED("Failed to Update the record"),
		APPROVE_FAILED("Failed to Approve the record"),
		MAKER_APPROVE_FAILED("Approval not allowed for the user who created/modified the record"),

		//Job Configuration Messages
		JOBCONFIG_MODIFIED("Job Configuration Modified"),
		JOBCONFIG_APPROVED("Job Configuration Approved"),
	
	    //Disable Messages
	    DISABLED_FAILED("Sorry!!! we are unable to disabled the selected user"),
	    DISABLED_SUCCESS("The selected user is disabled successfully"),
	    MAKER_CANNOT_APPROVE("Maker cannot approve the record"),
		MAKER_CANNOT_REJECT("Maker cannot reject the record");

		
		
		private String message;

		public String getMessage() {
			return message;
		}

		private ResponseMessage(String message) {
			this.message = message;
		}


}
