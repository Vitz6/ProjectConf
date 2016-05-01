var app = angular.module('myApp', []);
app.controller('showController', function ($scope, $http) {
    
   //var getEmployeesUrl = 'employees';
    var getCommentUrl = 'getcomments';
    
    $scope.setCommnts = function () {

        $http.post('getCommentUrl', "sad").then(successCallback, errorCallback);

    }

    $scope.getComments = function () {
       $http.get('getcomments').success(function (data) {
            $scope.comments = data;
        }).error(function (data, status) {
            alert("Error");
        });
    }



    $scope.sendComment= function (comment) {
        //alert(comment);
        return $http.post('setcomment', comment);
    }


});