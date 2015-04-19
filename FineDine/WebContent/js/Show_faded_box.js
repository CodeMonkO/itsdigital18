function Show_faded_box(contentId){
						document.getElementById('popupbox').style.visibility="visible";	
						if(contentId=='order_device'){
							document.getElementById('deviceId').style.display='block';
							document.getElementById('deviceId1').style.display='none';
							document.getElementById('deviceId2').style.display='none';
							document.getElementById('deviceId3').style.display='none';
						}else if(contentId=='add_device'){
							document.getElementById('deviceId').style.display='none';
							document.getElementById('deviceId1').style.display='block';
							document.getElementById('deviceId2').style.display='none';
							document.getElementById('deviceId3').style.display='none';
						}else if(contentId=='share_ownership'){
							document.getElementById('deviceId').style.display='none';
							document.getElementById('deviceId1').style.display='none';
							document.getElementById('deviceId2').style.display='block';
							document.getElementById('deviceId3').style.display='none';
						}else if(contentId=='history_device'){
							document.getElementById('deviceId').style.display='none';
							document.getElementById('deviceId1').style.display='none';
							document.getElementById('deviceId2').style.display='none';
							document.getElementById('deviceId3').style.display='block';
						}
					}