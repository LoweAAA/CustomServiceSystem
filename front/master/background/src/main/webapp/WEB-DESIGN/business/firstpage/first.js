$(document).ready(function() {
              $("#com_submit").click(function(){
                  $.ajax({
                      type: "GET",
                      data: {"com_mail": $("#commail").val(), "com_password": $("#compassword").val()},
                      url:"http://118.25.100.232:8080/CustomServiceSystem/ComLoginconfirm",
                      //url:"http://localhost:8080/ComLoginconfirm",
                      //url: "../../../ComLoginconfirm",
                      //contentType: "application/json; charset=utf-8",
                      dataType: "json",
                      success: function (data) {
                          // changeToTable(data);
                          $.each(data, function(i,item){
                              if(i=="data"){
                                  var id = item;
                                  var url = "../secondpage/account.html?com_id=" + id;
                                  alert("登陆成功！");
                                  window.location.href =url;
                              }

                          });

                      },
                      error: function () {
                          // $("#logininfo").text("请求超时");
                          alert("fail");
                      },
                  });
              });
          });