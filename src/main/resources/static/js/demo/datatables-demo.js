// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuarios();
  $('#dataTable').DataTable();
});

async function cargarUsuarios(){

    const request = await fetch('usuarios', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const usuarios = await request.json();
    let listadoHTML = '';
    // se recorre el array de json espacio por espacio  para mostar los uauarios Html
    for(let usuario of usuarios){
      let usuarioHTML = '<tr> <td>1</td><td>'+usuario.nombre+'  '+usuario.apellido+'</td><td>'+usuario.email+'</td><td>'+usuario.telefono+'</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';
      listadoHTML += usuarioHTML;
    }
    console.log(usuarios);
    let usuario = '<tr> <td>1</td><td>Javier cuasa pruena </td><td>cuasa@gamil.com</td><td>321212322</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';
                                        
    document.querySelector('#dataTable tbody').outerHTML = listadoHTML;

}