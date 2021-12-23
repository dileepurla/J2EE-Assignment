<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>

 <form method="get" action="hello-servlet">
     <table>
         <tr>
             <th>Name::</th>
             <td>
                 <input type="text" name="name">

             </td>
         </tr>
         <tr>
             <th>Mobile Number::</th>
             <td>
                 <input type="number" name="mobileNumber">

             </td>
         </tr>
         <tr>
             <th>Email Id</th>
             <td>
                 <input type="email" name="email">

             </td>
         </tr>
         <tr>
             <th>Adress</th>
             <td>
                 <input type="text" name="adress">

             </td>

         </tr>
         <tr>
             <td>
                 <input type="submit" value="submit">
             </td>
         </tr>
     </table>
 </form>


</body>
</html>