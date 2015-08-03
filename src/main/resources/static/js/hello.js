/**
 * Created by campitos on 23/07/15.
 */
angular.module('hello', [])
    .controller('home', function($scope, $http) {
      $http.get('/resource/').success(function(datos){
          $scope.greeting=datos;
      });
    })