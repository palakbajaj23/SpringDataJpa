$(document).ready(

function() {

	$("#subscriptionform").validate({
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
			"addressline1" : {
				required : true,	
			},
			"addressline2" : {
				required : true,
			}

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
			"addressline1" : {
				required : "Please enter address details",	
			},
			"addressline2":{
				required : "Please enter address details",	
			}	
		},

	});

	$.validator.addMethod("namecheck", function(value, element) {
		return /^[A-Za-z][A-Za-z]+$/.test(value);
	});
	$.validator.addMethod("idnumbercheck", function(value, element) {
		return /^[1-9][0-9]+$/.test(value);
	});
	
});