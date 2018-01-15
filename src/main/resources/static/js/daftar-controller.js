perpusApp.controller('DaftarController', 
    function($scope, $http, $window, $location) {
        $scope.daftarPerpus = [];

        $scope.updateDaftar = function() {
            $http.get("/get-home").then(sukses, gagal);

            function sukses(response) {
                $scope.daftarPerpus = response.data;
            }

            function gagal(response) {}
        };

        $scope.add = function() {
            $window.location.href = "/tambah-ui";
            //$location.path('/tambah-ui');
        }

        $scope.edit = function(perpus) {
            $window.location.href = "/edit-ui?id_buku=" + perpus.id_buku +
                    "&judul_buku=" + perpus.judul_buku +
                    "&penulis=" + perpus.penulis;
        };

        $scope.delete = function(perpus) {
            $http.delete("/api/delete/" + perpus.id_buku).then(sukses, gagal);

            function sukses(response) {
                $scope.updateDaftar();
            }

            function gagal(response) {}
        };

        $scope.updateDaftar();
    }
);