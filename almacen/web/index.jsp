<%-- 
    Document   : nuevo
    Created on : 02-feb-2016, 15:12:11
    Author     : PCA20
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Almacen de Medios</title>
    <h1><marquee>Bienvenido</marquee></h1>
        <link href="bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="bootstrap-3.3.6-dist/js/bootstrap.min.js" type="text/javascript"></script>
        <style type="text/css">
            input{
                border-radius:10px;
                box-shadow:0px 0px 25px rgba(30,144,255,0.3) inset;
                width: 100px;
                height: 30px;
                padding: 4px;
                margin: 10px;

            }
            #contenedor{
                width: 550px;
                border: 1px solid rgba(255,255,25,0.4);
                padding: 20px;
                margin: 20px;
                border-radius: 35px 35px 35px 35px;
                box-shadow:0px 10px 25px #0066cc;
                border-color: #ffffff;

            }
            td{
                text-align: left;
                font-size: 25px italic;

            }
            
        </style>
    </head>
    <body>
        
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <div id="contenedor">
                        <form action="crud?accion=agregar" method="post">
                            <table>
                                <legend>Ingresos</legend>
                                <tr>
                                    <td>Codigo de Inventario</td>
                                    <form action="crud?accion=codigo" method="post">
                                        <td> <input type="text" name="txtcodigo"  maxlength="5" readonly="readonly" /> 
                                    </form>
                                        <td colspan="3" align="right">Tipo de Medios</td><td colspan="5" align="right"> 
                                        <select name="medios">
                                            <option value="seleccione">Seleccione</option> 
                                            <option value="computacional">Computacional</option>
                                            <option value="oficina">Oficina</option>
                                        </select>
                                    </td>        
                                </tr> 
                                <tr>
                                    <td>Material de Fabricación</td>
                                    <td> <input type="text" name="txtmaterial"  /> </td> <td colspan="4" align="right">Marca</td>  <td colspan="5" align="right"> <input type="text" name="txtmarca"  /> </td>
                                </tr> 
                                <tr>
                                    <td>Productor</td>
                                    <td> <input type="text" name="txtprodutor"  /> </td>  <td colspan="4" align="right">Año de Fabricación</td>  <td colspan="5" align="right"> <input type="text" name="txtanio"  /> </td>   

                                </tr>

                                <tr>
                                    <td>Costo de Producción</td>
                                    <td> <input type="text" name="txtcosto"  maxlength="10" /> </td> <td colspan="4" align="right">Pais de Procedencia</td>  <td colspan="5" align="right"> <input type="text" name="txtpais"  /> </td>
                                </tr>

                                <tr>
                                    <td>Fecha de Entrada</td>
                                    <td> <input type="date" name="txtfecha"  maxlength="10" /> </td>
                                </tr>

                                <tr>
                                    <td align="left "colspan="2" > <br> <input type="submit" style="font-size:large; color:blue;" name="btnguardar"  value="Guardar"/> </br> </td> 
                                    <td align="center" colspan="4"> <br> <input type="submit" style="font-size:large; color:blue;" name="btnnuevo" value="Nuevo"/> </br> </td>
                                    <td align="right" colspan="3"> <br> <input type="submit" style="font-size:large; color:blue;"  name="btncancelar" value="Cancelar" /> </br> </td>                        
                                </tr> 
                            </table> 
                        </form>

                    </div>
                </div>
                <div class="col-md-6">
                    <div id="contenedor">
                        <form action="crud?accion=buscar" method="post">
                            <table>
                                <tr><legend>Consultas</legend></tr>   
                                <tr>
                                    <td align="right" colspan="5">Tipo de Busqueda</td>
                                    <td align="left" colspan="3"> 
                                        <select name="consultas">
                                            <option value="seleccione">Seleccione</option> 
                                            <option value="codigo">Codigo</option>
                                            <option value="med">Medios</option>
                                            <option value="productor">Productor</option>
                                            <option value="encargado">Responsable</option>
                                        </select>
                                    </td> 
                                </tr>
                                <tr>
                                    <td colspan="6">
                                        <br>
                                            <textarea cols="70" rows="9" ></textarea>
                                       </br>
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2"> <br> <input type="submit" style="font-size:large; color:blue;" name="btnbuscar"  value="Buscar"/> </br> </td> 
                                    <td colspan="2"> <br> <input type="submit" style="font-size:large; color:blue;" name="btnnueva" value="Nueva"/> </br> </td> 
                                    <td colspan="3"> <br><input type="text" name="txtayuda"  /></br></td>                        
                                </tr>    
                            </table> 
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>

</html>