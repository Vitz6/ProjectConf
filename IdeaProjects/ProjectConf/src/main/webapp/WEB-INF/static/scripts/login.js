var app = angular.module('myApp', []);
app.controller('myCtrl', function ($scope, $http, $location) {

    var redirectionUrl = '/site';

    $scope.loginUser = function () {
        var data = "username=" + $scope.username + "&password=" + $scope.password;
        $http.post('perform_login', data, {
            headers: {
                "content-type": "application/x-www-form-urlencoded"
            }
        }).success(function (data) {
            window.location.href = redirectionUrl;
        })
    }
});