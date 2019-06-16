/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo.java.at;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guilh
 */
public class OOJavaATTest {
    
    public OOJavaATTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class OOJavaAT.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        OOJavaAT.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mainMenu method, of class OOJavaAT.
     */
    @Test
    public void testMainMenu() {
        System.out.println("mainMenu");
        ArrayList<Aviao> aviaos = null;
        ArrayList<Helicoptero> helicopteros = null;
        ArrayList<Voo> voos = null;
        ArrayList<Aeroporto> aeroportos = null;
        ArrayList<Cidade> cidades = null;
        OOJavaAT.mainMenu(aviaos, helicopteros, voos, aeroportos, cidades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mainAeronaves method, of class OOJavaAT.
     */
    @Test
    public void testMainAeronaves() {
        System.out.println("mainAeronaves");
        ArrayList<Aviao> aviaos = null;
        ArrayList<Helicoptero> helicopteros = null;
        OOJavaAT.mainAeronaves(aviaos, helicopteros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mainVoos method, of class OOJavaAT.
     */
    @Test
    public void testMainVoos() {
        System.out.println("mainVoos");
        ArrayList<Voo> voos = null;
        ArrayList<Aviao> aviaos = null;
        ArrayList<Helicoptero> helicopteros = null;
        ArrayList<Aeroporto> aeroportos = null;
        OOJavaAT.mainVoos(voos, aviaos, helicopteros, aeroportos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mainAeroportos method, of class OOJavaAT.
     */
    @Test
    public void testMainAeroportos() {
        System.out.println("mainAeroportos");
        ArrayList<Aeroporto> aeroportos = null;
        OOJavaAT.mainAeroportos(aeroportos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mainCidades method, of class OOJavaAT.
     */
    @Test
    public void testMainCidades() {
        System.out.println("mainCidades");
        ArrayList<Cidade> cidades = null;
        OOJavaAT.mainCidades(cidades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menu method, of class OOJavaAT.
     */
    @Test
    public void testMenu() {
        System.out.println("menu");
        int expResult = 0;
        int result = OOJavaAT.menu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuAeronaves method, of class OOJavaAT.
     */
    @Test
    public void testMenuAeronaves() {
        System.out.println("menuAeronaves");
        int expResult = 0;
        int result = OOJavaAT.menuAeronaves();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuVoos method, of class OOJavaAT.
     */
    @Test
    public void testMenuVoos() {
        System.out.println("menuVoos");
        int expResult = 0;
        int result = OOJavaAT.menuVoos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuAeroportos method, of class OOJavaAT.
     */
    @Test
    public void testMenuAeroportos() {
        System.out.println("menuAeroportos");
        int expResult = 0;
        int result = OOJavaAT.menuAeroportos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuCidades method, of class OOJavaAT.
     */
    @Test
    public void testMenuCidades() {
        System.out.println("menuCidades");
        int expResult = 0;
        int result = OOJavaAT.menuCidades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuTipoAeronaves method, of class OOJavaAT.
     */
    @Test
    public void testMenuTipoAeronaves() {
        System.out.println("menuTipoAeronaves");
        int expResult = 0;
        int result = OOJavaAT.menuTipoAeronaves();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menuAlteracaoVoo method, of class OOJavaAT.
     */
    @Test
    public void testMenuAlteracaoVoo() {
        System.out.println("menuAlteracaoVoo");
        int expResult = 0;
        int result = OOJavaAT.menuAlteracaoVoo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leInteiro method, of class OOJavaAT.
     */
    @Test
    public void testLeNumero() {
        System.out.println("leNumero");
        String msg = "";
        int expResult = 0;
        int result = OOJavaAT.leInteiro(msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leString method, of class OOJavaAT.
     */
    @Test
    public void testLeEntrada() {
        System.out.println("leEntrada");
        String msg = "";
        String expResult = "";
        String result = OOJavaAT.leString(msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leTipo method, of class OOJavaAT.
     */
    @Test
    public void testLeTipo() {
        System.out.println("leTipo");
        TIPO expResult = null;
        TIPO result = OOJavaAT.leTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leAeroporto method, of class OOJavaAT.
     */
    @Test
    public void testLeAeroporto() {
        System.out.println("leAeroporto");
        String msg = "";
        ArrayList<Aeroporto> aeroportos = null;
        Aeroporto expResult = null;
        Aeroporto result = OOJavaAT.leAeroporto(msg, aeroportos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leAviao method, of class OOJavaAT.
     */
    @Test
    public void testLeAviao() {
        System.out.println("leAviao");
        String msg = "";
        ArrayList<Aviao> aviaos = null;
        Aviao expResult = null;
        Aviao result = OOJavaAT.leAviao(msg, aviaos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leHelicoptero method, of class OOJavaAT.
     */
    @Test
    public void testLeHelicoptero() {
        System.out.println("leHelicoptero");
        String msg = "";
        ArrayList<Helicoptero> helicopteros = null;
        Helicoptero expResult = null;
        Helicoptero result = OOJavaAT.leHelicoptero(msg, helicopteros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarAeroportos method, of class OOJavaAT.
     */
    @Test
    public void testConsultarAeroportos() {
        System.out.println("consultarAeroportos");
        ArrayList<Aeroporto> aeroportos = null;
        String expResult = "";
        String result = OOJavaAT.consultarAeroportos(aeroportos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarVoos method, of class OOJavaAT.
     */
    @Test
    public void testConsultarVoos() {
        System.out.println("consultarVoos");
        ArrayList<Voo> voos = null;
        String expResult = "";
        String result = OOJavaAT.consultarVoos(voos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarAeronaves method, of class OOJavaAT.
     */
    @Test
    public void testConsultarAeronaves() {
        System.out.println("consultarAeronaves");
        ArrayList<Aviao> aviaos = null;
        ArrayList<Helicoptero> helicopteros = null;
        int tipoAeronave = 0;
        String expResult = "";
        String result = OOJavaAT.consultarAeronaves(aviaos, helicopteros, tipoAeronave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mensagem method, of class OOJavaAT.
     */
    @Test
    public void testMensagem() {
        System.out.println("mensagem");
        String msg = "";
        OOJavaAT.mensagem(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarAeronaves method, of class OOJavaAT.
     */
    @Test
    public void testListarAeronaves() {
        System.out.println("listarAeronaves");
        ArrayList<Aviao> aviaos = null;
        ArrayList<Helicoptero> helicopteros = null;
        OOJavaAT.listarAeronaves(aviaos, helicopteros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarAeronaves method, of class OOJavaAT.
     */
    @Test
    public void testCadastrarAeronaves() {
        System.out.println("cadastrarAeronaves");
        ArrayList<Aviao> aviaos = null;
        ArrayList<Helicoptero> helicopteros = null;
        OOJavaAT.cadastrarAeronaves(aviaos, helicopteros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerAeronaves method, of class OOJavaAT.
     */
    @Test
    public void testRemoverAeronaves() {
        System.out.println("removerAeronaves");
        ArrayList<Aviao> aviaos = null;
        ArrayList<Helicoptero> helicopteros = null;
        OOJavaAT.removerAeronaves(aviaos, helicopteros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerAviao method, of class OOJavaAT.
     */
    @Test
    public void testRemoverAviao() {
        System.out.println("removerAviao");
        ArrayList<Aviao> aviaos = null;
        ArrayList<Helicoptero> helicopteros = null;
        int tipoAeronave = 0;
        OOJavaAT.removerAviao(aviaos, helicopteros, tipoAeronave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerHelicoptero method, of class OOJavaAT.
     */
    @Test
    public void testRemoverHelicoptero() {
        System.out.println("removerHelicoptero");
        ArrayList<Aviao> aviaos = null;
        ArrayList<Helicoptero> helicopteros = null;
        int tipoAeronave = 0;
        OOJavaAT.removerHelicoptero(aviaos, helicopteros, tipoAeronave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarVoos method, of class OOJavaAT.
     */
    @Test
    public void testListarVoos() {
        System.out.println("listarVoos");
        ArrayList<Voo> voos = null;
        OOJavaAT.listarVoos(voos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarVoos method, of class OOJavaAT.
     */
    @Test
    public void testCadastrarVoos() {
        System.out.println("cadastrarVoos");
        ArrayList<Voo> voos = null;
        ArrayList<Aviao> aviaos = null;
        ArrayList<Helicoptero> helicopteros = null;
        ArrayList<Aeroporto> aeroportos = null;
        OOJavaAT.cadastrarVoos(voos, aviaos, helicopteros, aeroportos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerVoos method, of class OOJavaAT.
     */
    @Test
    public void testRemoverVoos() {
        System.out.println("removerVoos");
        ArrayList<Voo> voos = null;
        OOJavaAT.removerVoos(voos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarVoos method, of class OOJavaAT.
     */
    @Test
    public void testEditarVoos() {
        System.out.println("editarVoos");
        ArrayList<Voo> voos = null;
        ArrayList<Aeroporto> aeroportos = null;
        ArrayList<Aviao> aviaos = null;
        ArrayList<Helicoptero> helicopteros = null;
        OOJavaAT.editarVoos(voos, aeroportos, aviaos, helicopteros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarAeroportos method, of class OOJavaAT.
     */
    @Test
    public void testCadastrarAeroportos() {
        System.out.println("cadastrarAeroportos");
        ArrayList<Aeroporto> aeroportos = null;
        OOJavaAT.cadastrarAeroportos(aeroportos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadastrarCidades method, of class OOJavaAT.
     */
    @Test
    public void testCadastrarCidades() {
        System.out.println("cadastrarCidades");
        ArrayList<Cidade> cidades = null;
        OOJavaAT.cadastrarCidades(cidades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
