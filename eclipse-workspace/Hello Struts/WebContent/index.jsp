<%@ taglib uri="/struts-tags" prefix="s" %>  
<s:form action="employee" method="post">  
<s:textfield name="id" label="Employee Id"></s:textfield>  
<s:textfield name="name" label="Employee Name"></s:textfield>  
<s:textfield name="code" label="Employee Code"></s:textfield>  
<s:submit value="save"></s:submit>  
</s:form>  