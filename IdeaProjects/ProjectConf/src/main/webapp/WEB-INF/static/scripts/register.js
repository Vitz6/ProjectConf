var app = angular.module('myApp', []);
app.controller('myCtrl', function ($scope, $http) {


    var setUser = 'setuser';

    $scope.alert="";

    $scope.setUser= function (user) {
        $http.post("/setuser", user) .then(function(response) {
            $scope.alert = response.data.toString();
        });

    }


});

/**
 * Created by wincenty on 5/1/2016.
 */
