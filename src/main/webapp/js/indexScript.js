/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function() {
    $('#resultadoConsulta tr td ').on('click', 'a', function(e) {
        e.preventDefault();
        var option = $(this).text();
        var id = (this).id;
        if (option === "Eliminar")
        {
            var r = confirm("Seguro que Desea Eliminar El registro?");
            if (r)
            {                
                //post delete method here
                $.ajax({
                    type: "POST",
                    url: "eliminarProfesor",
                    data: {codigo : id},
                    success: location.reload()
                });
            }
        }
    });
});
