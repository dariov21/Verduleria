(function(){

var app = angular.module('verduleriaApp',[ ]);
    app.controller('verduleriaController',['$http','$scope',function($http,$scope){
        verduleria = this;
        $scope.verduras = {};
        verduleria.verdura = {};
        
        verduleria.verdurasListar = function(){        
        	$http.get('/Verduleria/api/verduras/lista').success(function(data){
           	 $scope.verduras = data.verduras;
           });       
        };
        
        verduleria.verdurasListar();
        
        verduleria.addVerdura = function(){
        	var data = {verduras:verduleria.verdura};
        	
        	$http.post('/Verduleria/api/verduras/guardar',data).success(function(data){
            	verduleria.verdurasListar(); 
            	verduleria.verdura = {};
            });
        };
        verduleria.remover = function(verdura){
        	
        };
        
        
    }]);   

})();