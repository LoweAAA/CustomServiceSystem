$(document).ready(function() {
              $("#com_submit").click(function(){
                  $.ajax({
                      type: "POST",
                      data: {"com_mail": $("#commail").val(), "com_password": $("#compassword").val()},
                      //url:"http://118.25.100.232:8080/CustomServiceSystem/ComLoginconfirm",
                      url:"http://localhost:8080/company/login",
                      //url: "../../../ComLoginconfirm",
                      //contentType: "application/json; charset=utf-8",
                      dataType: "json",
                      success: function (data) {

                          if (data.complete == false){
                              alert(data.errmessage);
                              return ;
                          }

                          if (data.flag == false){
                              alert(data.errmessage);
                          }else {
                              $.cookie('comToken', data.token, { expires: 1, path: '/' });
                              $.cookie('comId',data.data.companyId, { expires: 1, path: '/' });

                              alert(data.errmessage);

                              //$.cookie('compassword',$("#compassword").val());

                              var url = "../secondpage/account.html";
                              window.location.href =url;
                          }

                          // changeToTable(data);
                          // $.each(data, function(i,item){
                          //     if(i=="complete" && item != true){
                          //         debugger;
                          //         return ;
                          //     }else if (i == "errmessage"){
                          //         debugger;
                          //         var  errMessage = item.val();
                          //         var url = "../secondpage/account.html?com_id=" + id;
                          //         alert(errMessage);
                          //         //window.location.href =url;
                          //     }
                          //});


                      },
                      error: function (data) {
                          // $("#logininfo").text("请求超时");
                          alert(data.errmessage);
                      },
                  });
              });
});
