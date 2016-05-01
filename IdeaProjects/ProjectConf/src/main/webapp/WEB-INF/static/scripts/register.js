var app = angular.module('myApp', []);
app.controller('showController', function ($scope, $http) {


    var setUser = 'setuser';

    

    $scope.setUser= function (user) {
        //alert(comment);
        return $http.post("/setuser", user);
    }


});/**
 * Created by wincenty on 5/1/2016.
 */
