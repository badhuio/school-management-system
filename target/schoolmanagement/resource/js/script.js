


$(document).ready(function(){
	

	// Students
	
		$("#Submit").click(function(){
		
		let admissionNumber = $("#AdmissionNumber").val().trim();
		let name = $("#Name").val().trim();
		let studentClass = $("#StudentClass").val().trim(); 
		let section = $("#Section").val().trim(); 
		let gender = $("#Gender").val().trim();
		let dob = $("#Dob").val().trim(); 
		let parentName = $("#ParentName").val().trim(); 
		let mobile = $("#Mobile").val().trim(); 
		let address = $("#Address").val().trim(); 
		let admissionYear = $("#AdmissionYear").val().trim(); 
		let status = $("#Status").val().trim(); 
		
			//alert("hey"+number); alert("hey"+name); alert("hey"+classes); alert("hey"+section); alert("hey"+gender); alert("hey"+dob); alert("hey"+parent_name); alert("hey"+mobile); alert("hey"+address); alert("hey"+admission_year); alert("hey"+status);

	
			$.ajax({
				url:path + "/saving",
				method:"POST",
				contentType: "application/json",
				data: JSON.stringify ({
					admissionNumber : admissionNumber,
					name : name,
					studentClass : studentClass,
					section : section,
					gender : gender,
					dob : dob,
					parentName : parentName,
					mobile : mobile,
					address : address,
					admissionYear : admissionYear,
					status : status
				}),
				success: function () {
				          loadUsers();   
				      }
			})	
			
			function loadUsers() {
			$.ajax({
					url:path + "/users",
					method: "GET",
					success: function(response){
										
					let users = response;
										
					let tableBody = $("#userTableBody");
						tableBody.empty();
										
					users.forEach(function(users){
							let row = `<tr data-id="${users.id}">
										   <td classes="id">${users.id}</td>
										   <td  class="name">${users.admissionNumber} </td>
										   <td class="email">${users.name}</td>
										   <td class="email">${users.studentClass}</td>
										   <td class="email">${users.section}</td>
										   <td class="email">${users.gender}</td>
										   <td class="email">${users.dob}</td>
										   <td class="email">${users.parentName}</td>
										   <td class="email">${users.mobile}</td>
										   <td class="email">${users.address}</td>
										   <td class="email">${users.admissionYear}</td>
										   <td class="email">${users.status}</td>
									   </tr>`;
							tableBody.append(row);
				    });							
					},
					error: function() {
							alert("Error loading user list.");
					}
			});

		}		
	});
	


// Classes


	$("#Submit1").click(function(){

		let className = $("#ClassName").val().trim();
		let section = $("#Section").val().trim();
		let academicYear = $("#AcademicYear").val().trim();
		let status = $("#Status").val().trim();
		
			$.ajax({
				url:path + "/saving1",
				method:"POST",
				contentType: "application/json",
				data: JSON.stringify ({
					className : className,
					section : section,
					academicYear : academicYear,
					status : status
	   			})
			})	
		
		
	});




// Fees


	$("#Submit2").click(function(){

		let classes = $("#Classes").val().trim();
		let tutionFee = $("#TutionFee").val().trim();
		let transportFee = $("#TransportFee").val().trim();
		let activityFee = $("#ActivityFee").val().trim();
		let examFee = $("#ExamFee").val().trim();
		let annualFee = $("#AnnualFee").val().trim();
		let status = $("#Status").val().trim();
		
			$.ajax({
				url:path + "/saving2",
				method:"POST",
				contentType: "application/json",
				data: JSON.stringify ({
					classes : classes,
					tutionFee : tutionFee,
					transportFee : transportFee,
					activityFee : activityFee,
					examFee : examFee,
					annualFee : annualFee,
					status : status
	   			})
			})	
		
		
	});
});
