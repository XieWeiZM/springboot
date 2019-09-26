Hello Word <br/>
${name}
<#if sex ==0>
    <label style="color: red">男</label>
<#elseif sex ==1 >
    <label style="color: green">女</label>
<#else >
    <label style="color: black">人妖</label>
</#if>
<br/>


<#list list as userList>
  ${userList} <br/>
</#list>