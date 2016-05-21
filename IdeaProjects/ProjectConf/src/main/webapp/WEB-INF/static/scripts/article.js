var app = angular.module('myApp', []);
app.controller('myCtrl', function ($scope, $http, $location) {

    $scope.alert="";

    $scope.setArt= function (article) {
        $http.post("/setarticle", article).then(function (response) {
            $scope.alert = response.data.toString();

        });

    }

  var getConfs= function () {
        $http.get('/getconferences').success(function (data) {

            $scope.conferences = data;
        }).error(function (data, status) {
            alert("Error");
        });
        
    }
getConfs();

    

});





/**
 * Created by wincenty on 5/17/2016.
 */
