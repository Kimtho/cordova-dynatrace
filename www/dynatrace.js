/*global cordova, module */
'use strict';
module.exports = (function() {
  var init = function() {
    cordova.exec(function(){},function(){}, 'dynatracecordova', 'init', []);
  };


  return {
    init: _init,
  
  };
})();
