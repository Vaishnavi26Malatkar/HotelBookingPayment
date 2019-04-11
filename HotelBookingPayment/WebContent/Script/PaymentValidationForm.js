function validatePaymentForm()
{
  var Amount=document.getElementById("payAmt").value;
  var Mode=document.getElementById("payMode").value;
  var name=document.getElementById("nmCard").value;
  var Num=document.getElementById("cNo").value;
  var expiery=document.getElementById("eDate").value;
  var cvvNo=document.getElementById("cvv").value;
  var paymentDate=document.getElementById("payDate").value;
  
  if(Amount==null || Amount=="")
	  {
	  window.alert("Payment can not be empty...");
	   return false;
	  }
  
  if(Mode==null || Mode=="")
	  {
	  window.alert("Payment Mode can not be empty...");
	  
	  return false;
	  }

  
  if(name==null || name=="")
	  {
	  
	  window.alert("Card Holder Name can not be empty...");
	  return false;
	  }
  
  if(Num==null || Num=="")
  {
  
  window.alert("Card Number can not be empty...");
  return false;
  }
  
  if(expiery==null || expiery=="")
  {
  
  window.alert("Expiery Date can not be empty...");
  return false;
  }
  
  if(cvvNo==null || cvvNo=="")
  {
  
  window.alert("CVV can not be empty...");
  return false;
  }
  
  if(paymentDate==null || paymentDate=="")
  {
  
  window.alert("Payment Date can not be empty...");
  return false;
  }
  
  return true;
}