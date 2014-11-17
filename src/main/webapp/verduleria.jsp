<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app = "verduleriaApp">
<head>
<style type="text/css">
	  .css-form input.ng-invalid.ng-dirty {
	    background-color: #FA787E;
	  }
	
	  .css-form input.ng-valid.ng-dirty {
	    background-color: #78FA89;
	  }
	  .tableVerduras{
	  	width: 450px;
		background-color: aliceblue;
	  }
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.25/angular.min.js"></script>
<script type="text/javascript" src="app.js"></script>
<title>Verduleria</title>
</head>
<body ng-controller = "verduleriaController as vCtrl"  >
<div >
 <div style="background-color:orange;height:325px;width:275px;float: left">
  <h3> Nueva Verdura o Fruta </h3>
   <form ng-submit="vCtrl.addVerdura()" novalidate>
     <fieldset class="form-group">
      <input ng-model='vCtrl.verdura.nombre' class="form-control" type="text" />
     </fieldset>
     <fieldset class="form-group">
     	<textarea ng-model="vCtrl.verdura.description" class="form-control" placeholder="Pequeña descripcion de la verdura..." title="Verdura"></textarea>
     </fieldset> 
     <fieldset class="form-group">
          <input ng-model ="vCtrl.verdura.precioUnitario" type="number" class="form-control" />
     </fieldset>    
     <fieldset class="form-group">
          <input type="submit" class="btn btn-primary pull-right" value="Agregar" />
     </fieldset>  
   
   </form>
  </div> 
  
  <table class="tableVerduras" syle="width:100%;float:left">
  <thead><td>Producto</td><td>Precio</td><td>----</td></thead>
  <tbody> 
  <tr sytle="width:100%" ng-repeat="v in verduras">    
    <td>{{v.nombre}}</td><td> Precio {{v.precioUnitario |currency }} </td><td><a ng-click="vCtrl.remover(verdura)">remover</a></td>
  </tr>  
  </tbody>  
   </table> 
</div>
   
</body>
</html>