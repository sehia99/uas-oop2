perpusApp.controller('EditController', 
    function($scope, $http, $window) {

        $scope.perpus = {};

        $scope.load = function() {
            var data = $window.location.search.split("&");
            for(i=0; i<data.length; i++) {
                console.log(data[i]);
                switch(i) {
                    case 0: $scope.perpus.id_buku = data[i].split("=")[1];
                    case 1: $scope.perpus.judul_buku = data[i].split("=")[1];
                    case 2: $scope.perpus.penulis = data[i].split("=")[1];
                }
            }
        }

        $scope.simpan = function() {
            $http.post("/api/tambah", $scope.perpus).then(sukses, gagal);

            function sukses(response) {
                $window.location.href = "/";    
            }

            function gagal(response) {}
        }

        $scope.batal = function() {
            $window.location.href = "/";
        }

        $scope.load();

});