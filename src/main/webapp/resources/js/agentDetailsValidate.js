$(document).ready(

function() {

	$("#registrationform").validate({
		rules : {

			"firstName" : {
				required : true,
				namecheck : true
			},

			"lastName" : {
				required : true,
				namecheck : true
			},

			"idNumber" : {
				required : true,
				idnumbercheck : true
			},
			"username" : {
				required : true
			},
			"password" : {
				required : true
			},
			"active" : {

			},
			"role.roleId" : {
				required : true
			},
			"groupName" : {
				required : true
			},
			"proofOfAddress" : {
				required : true
			},
			"contactNumber" : {
				required : true
			},

		},
		messages : {

			"firstName" : {
				required : "Please enter First Name",
				namecheck : "Enter valid First Name"
			},

			"lastName" : {
				required : "Please enter Last Name",
				namecheck : "Enter valid Last Name"
			},

			"idNumber" : {
				required : "Please enter ID Number",
				idnumbercheck : "Enter valid ID Number"
			},

			"username" : {
				required : "Please enter Username",
			},
			"password" : {
				required : "Please enter Password",
			},
			"active" : {

			},
			"role.roleId" : {
				required : "Please select role ",
			},
			"groupName" : {
				required : "Please enter Group Name",
			},
			"contactNumber" : {
				required : "Please enter Contact Number",
			},
		},

	});

	$.validator.addMethod("namecheck", function(value, element) {
		return /^[A-Za-z][A-Za-z]+$/.test(value);
	});
	$.validator.addMethod("idnumbercheck", function(value, element) {
		return /^[1-9][0-9]+$/.test(value);
	});

});