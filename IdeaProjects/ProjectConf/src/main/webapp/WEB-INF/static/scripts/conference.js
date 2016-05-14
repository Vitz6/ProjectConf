var app = angular.module('myApp', []);
app.controller('myCtrl', function ($scope, $http) {

    
    $scope.alert="";

    $scope.addConf= function (conference) {
        $http.post("/setconference", conference) .then(function(response) {
            $scope.alert = response.data.toString();

        });

    }


});


/**
 * Created by wincenty on 5/4/2016.
 */
