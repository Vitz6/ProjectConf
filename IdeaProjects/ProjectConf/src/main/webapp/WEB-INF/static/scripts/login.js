var app = angular.module('myApp', []);
app.controller('myCtrl', function ($scope, $http) {
    
    var setUser = 'loginuser';

    $scope.alert="";

    $scope.loginUser= function (user) {
          $http.post("/loginuser", user) .then(function(response) {
            $scope.alert = response.data.toString();

        });

    }


})
;


