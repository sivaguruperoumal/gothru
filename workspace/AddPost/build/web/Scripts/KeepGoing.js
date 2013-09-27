/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


var controllers = angular.module('KeepGoing.controllers', []);

var services = angular.module('KeepGoing.services', ['ngResource']);

var filters = angular.module('KeepGoing.filters', []);

var directives = angular.module('KeepGoing.directives', []);

var KeepGoing = angular.module('KeepGoing',
['KeepGoing.controllers', 'KeepGoing.services', 'KeepGoing.filters', 'KeepGoing.directives','ngResource'])
.config(['$routeProvider', function ($routeProvider) {
      $routeProvider.when('/Home', { templateUrl: 'Home.jspf' });
      $routeProvider.when('/AboutUs', { templateUrl: 'AboutUs.jspf' });
      $routeProvider.when('/Login', { templateUrl: '/Account/Login' });
      $routeProvider.when('/Search', { templateUrl: '/jspf/CarPooling/SearchPosts.jspf' });
      $routeProvider.when('/CabbiePost', { templateUrl: '/jspf/CarPooling/CabbiePost.jspf' });
      $routeProvider.otherwise({ redirectTo: '/Home' });
  }]);



