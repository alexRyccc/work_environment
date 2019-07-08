


(function() {

	$(function(){
		var index =0;
		var p =location.search;
		var arr =p.split("=");
		var type =arr[1];
		
		var sg=0;
		var ch =50;
		var gp =70;
		selectSg(1);
		selectChe(1);
		selectGp(1);
			
		function selectSg(page){
	
			var pages =page;
			$.ajax({
				url:'../examy/querysin/'+type+'/'+pages,
				
				method:'get',  
				data:$('form').serialize(),
				async:false,  
				success:function(data){
					
					var jsonObj = JSON.parse( JSON.stringify(data));
					var ul='';
				
					
					$.each(data,function(index,val){
						sg=sg+1;
						index =index+1;
						
						if(val!=null){
							
						
						
						ul+=`
						
						<ul id="uldaan" value="">
							<li id="answer${sg}" value ="${val.sgid}">
							<div class="test_content_nr_tt">
								<i id="idint_0">${index}</i><span>(2分)</span><font>${val.sgname}</font><b class="icon iconfont">&#xe881;</b>
							</div>

							<div class="test_content_nr_main">
								<ul>
										<li class="option">
											
												<input type="radio" class="radioOrCheck" onclick=""  name="answer${sg}"
													 value ="A" />
											
											
											<label for="0_answer_1_option_1">
												
												<p class="ue" style="display: inline;">${val.sga}</p>
											</label>
										</li>
									
										<li class="option">
											
												<input type="radio" class="radioOrCheck" name="answer${sg}" onclick=""
													  value ="B"
												/>
											
											
											<label for="0_answer_1_option_2">
												
												<p class="ue" style="display: inline;">${val.sgb}</p>
											</label>
										</li>
									
										<li class="option">
											
												<input type="radio" class="radioOrCheck" name="answer${sg}" onclick=""
													 value ="C"
												/>
											
											
											<label for="0_answer_1_option_3">
												
												<p class="ue" style="display: inline;">${val.sgc}</p>
											</label>
										</li>
									
										<li class="option">
											 
												<input type="radio" class="radioOrCheck" name="answer${sg}" onclick=""
													 value ="D"
												/>
											
											
											<label for="0_answer_1_option_4">
												
												<p class="ue" style="display: inline;">${val.sgd}</p>
											</label>
										</li>
									
								</ul>
							</div>
						</li>
						</ul>
						
						`;
					
						}
						
					});
					$('#tx').html(ul);
				
				},
				dataType:'json'
			});
		
			
		}
		
		
		function selectChe(page){
			
			var pages =page;
			$.ajax({
				url:'../examy/queryche/'+type+'/'+pages,
				
				method:'get', 
				data:$('form').serialize(),
				async:false,  
				success:function(data){
					//
					var jsonObj = JSON.parse( JSON.stringify(data));
					var ul='';
					//遍历data,并在表格中显示
				
					$.each(data,function(index,val){
						ch=ch+1;
						index =index+1;
					
						ul+=`
					
						<ul>
							<li id="answer${ch}" value ="${val.chid}">
							<div class="test_content_nr_tt">
								<i id ="idint_1">${index}</i><span>(3分)</span><font>${val.chname}</font><b class="icon iconfont">&#xe881;</b>
							</div>

							<div class="test_content_nr_main">
								<ul>
									
										<li class="option">
											
												<input type="checkbox" class="radioOrCheck" onclick=""  name="answer${ch}"
													 value ="A" />
											
											
											<label for="0_answer_1_option_1">
												
												<p class="ue" style="display: inline;">${val.cha}</p>
											</label>
										</li>
									
										<li class="option">
											
												<input type="checkbox" class="radioOrCheck" name="answer${ch}" onclick=""
													  value ="B"
												/>
											
											
											<label for="0_answer_1_option_2">
												
												<p class="ue" style="display: inline;">${val.chb}</p>
											</label>
										</li>
									
										<li class="option">
											
												<input type="checkbox" class="radioOrCheck" name="answer${ch}" onclick=""
													 value ="C"
												/>
											
											
											<label for="0_answer_1_option_3">
												
												<p class="ue" style="display: inline;">${val.chc}</p>
											</label>
										</li>
									
										<li class="option">
											 
												<input type="checkbox" class="radioOrCheck" name="answer${ch}" onclick=""
													 value ="D"
												/>
											
											
											<label for="0_answer_1_option_4">
												
												<p class="ue" style="display: inline;">${val.chd}</p>
											</label>
										</li>
									
								</ul>
							</div>
						</li>
						</ul>
						`;
					
					});
					$('#duox').html(ul);
					
				},
				dataType:'json'
			});
			
			
		}
		
	
		function selectGp(page){
		
			var pages =page;
			$.ajax({
				url:'../examy/querygap/'+type+'/'+pages,
				method:'get',  
				
				data:$('form').serialize(),
				async:false,  
				success:function(data){
					//
					var ul='';
					
					$.each(data,function(index,val){
						gp=gp+1;
						index=index+1;
						ul+=`
						<ul id="uldaan" value="">
							<li id="answer${gp}" value ="${val.gpid}">
							<div class="test_content_nr_tt">
								<i id="idint_2">${index}</i><span>(2分)</span><font>${val.gpname}</font><b class="icon iconfont">&#xe881;</b>
							</div>

							<div class="test_content_nr_main">														
							<input type="text" class="layui-input" onclick="upperCase(this.id)"  name="answer${gp}"   id="answer${gp}" value ="" />

									<label for="0_answer_1_option_1">	
									<br>									
									<hr>
									</label>
							</div>
						</li>
						</ul>
					
						`;
						$("#idint_2").html(index);
					});
					$('#tkt').html(ul);
					
				},
				dataType:'json'
			});
		
			
		}
		$("#btn1").on('click',function(e){
			
			var dx ="单选_"
			$("#tx :checked").each(function () {
			 	
			   dx += ($(this).val());
			   dx += "_";
			   
			   
			});
			var dux =""
				
		    var legchecked = $("#duox [name='answer51']:checked").length;
		    if (legchecked<1){ 
		    	alert("多选题第一题未填写") 
		    	return
		    	};   var legchecked2 = $("#duox [name='answer52']:checked").length;
			    if (legchecked2<1){ 
			    	alert("多选题第二题未填写") 
			    	return
			    	};
			    	   var legchecked3 = $("#duox [name='answer53']:checked").length;
					    if (legchecked3<1){ 
					    	alert("多选题第三题未填写") 
					    	return
					    	};
					    	   var legchecked4 = $("#duox [name='answer54']:checked").length;
							    if (legchecked4<1){ 
							    	alert("多选题第四题未填写") 
							    	return
							    	};
							    	   var legchecked5 = $("#duox [name='answer55']:checked").length;
									    if (legchecked5<1){ 
									    	alert("多选题第五题未填写") 
									    	return
									    	};
									    	   var legchecked6 = $("#duox [name='answer56']:checked").length;
											    if (legchecked6<1){ 
											    	alert("多选题第六题未填写") 
											    	return
											    	};
											    	   var legchecked7 = $("#duox [name='answer57']:checked").length;
													    if (legchecked7<1){ 
													    	alert("多选题第七题未填写") 
													    	return
													    	};
													    	   var legchecked8 = $("#duox [name='answer58']:checked").length;
															    if (legchecked8<1){ 
															    	alert("多选题第八题未填写") 
															    	return
															    	};
															    	   var legchecked9 = $("#duox [name='answer59']:checked").length;
																	    if (legchecked9<1){ 
																	    	alert("多选题第九题未填写") 
																	    	return
																	    	};
																	    	   var legchecked0 = $("#duox [name='answer60']:checked").length;
																			    if (legchecked0<1){ 
																			    	alert("多选题第十题未填写") 
																			    	return
																			    	};
																			    	
		    	
				$("#duox [name='answer51']:checked").each(function () {		
				
				 dux += ($(this).val());	  
				 
			 
			 });    
			dux += "_";
			$("#duox [name='answer52']:checked").each(function () {			  
				 dux += ($(this).val());	  
				 
			 });     
			dux += "_";
			$("#duox [name='answer53']:checked").each(function () {			  
				 dux += ($(this).val());	  
				
			 }); 
			 dux += "_";
			$("#duox [name='answer54']:checked").each(function () {			  
				 dux += ($(this).val());	  
				 
			 });  
			dux += "_";
			$("#duox [name='answer55']:checked").each(function () {			  
				 dux += ($(this).val());	  
				
			 });   
			 dux += "_";
			$("#duox [name='answer56']:checked").each(function () {			  
				 dux += ($(this).val());	  
				
			 });  
			 dux += "_";
			$("#duox [name='answer57']:checked").each(function () {			  
				 dux += ($(this).val());	  
				 
			 });   
			dux += "_";
			$("#duox [name='answer58']:checked").each(function () {			  
				 dux += ($(this).val());	  
				 
			 });  
			dux += "_";
			$("#duox [name='answer59']:checked").each(function () {			  
				 dux += ($(this).val());	  
				 
			 }); 
			dux += "_";
			$("#duox [name='answer60']:checked").each(function () {			  
				 dux += ($(this).val());	  
			
			 });     
			 dux += "_";
			
			
			
			var tk="填空_"
			$("#tkt :input").each(function () {
			  
			   tk += ($(this).val());
			   tk += "_";
			});
		 
			if(dx.length<23||dux.length<23){
				alert("试卷尚未完成")
			}else{ 
				$.ajax({
					method:'post',
					url:'../examp/check',
					data:{"dx":dx,"dux":dux,"tk":tk,"type":type,"time":time}, /*  */
					
					success:function(data){
						if(data=="OK"){
							window.location.href='../result.html';
						}
					},
					dataType:'text'/* ,
					contentType:'application/json'//以json方式提交 */
				});  
			}
			
		
			
			 /* obj = document.getElementsByName("answer1");
			    check_val = [];
			    for(k in obj){
			        if(obj[k].checked)
			            check_val.push(obj[k].value);
			    } */
			 
	/* 		var pages =$("#ids").val(); */
		 	
			 
	/*  		$.ajax({
				method:'post',
				url:'../exam/check2/'+check_val+"/"+pages,
				
				success:function(data){
					if(data=="回答正确"){
						fen =fen +1;
						$("#fenshu").html(fen);
					}
					select(pages);
				},
				dataType:'text',
				contentType:'application/json'//以json方式提交
			});  */ 
			
			
		})
		
	});
	
	
	
}).call(this);
