package ca.mcgill.ecse211.mountev3rest.util;

import java.util.Map;

/**
 * Data class for representing a particular map setup.
 * <p>
 * The {@code Map} class does not contain any significant logic, instead it holds the various
 * coordinates used to represent key locations on a map such as the location of the tree, the tunnel
 * and the river limits which are used throughout the entire routine.
 * 
 * @author angelortiz
 *
 */
public class CoordinateMap {

  // Attributes
  public String teamColor;
  public long RedTeam;
  public long GreenTeam;

  // Team coordinates
  public long StartCorner;
  public long LL_x; // X coordinate of the lower left corner of the starting area.
  public long LL_y; // Y coordinate of the lower left corner of the starting area.
  public long UR_x; // X coordinate of the upper right corner of the starting area.
  public long UR_y; // Y coordinate of the upper right corner of the starting area.
  public long TN_LL_x; // X coordinate of the lower left corner of the tunnel.
  public long TN_LL_y; // Y coordinate of the lower left corner of the tunnel.
  public long TN_UR_x; // X coordinate of the upper right corner of the tunnel.
  public long TN_UR_y; // Y coordinate of the upper right corner of the tunnel.
  public long T_x; // X coordinate of the ring set.
  public long T_y; // Y coordinate of the ring set.

  // Other team coordinates
  public long StartCorner_o;
  public long LL_x_o;
  public long LL_y_o;
  public long UR_x_o;
  public long UR_y_o;
  public long TN_LL_x_o;
  public long TN_LL_y_o;
  public long TN_UR_x_o;
  public long TN_UR_y_o;
  public long T_x_o;
  public long T_y_o;

  // General coordinates
  public long I_LL_x; // X coordinate of the lower left corner of the search area.
  public long I_LL_y; // Y coordinate of the lower left corner of the search area.
  public long I_UR_x; // X coordinate of the upper right corner of the search area.
  public long I_UR_y; // Y coordinate of the upper right corner of the search area.

  /**
   * Creates a {@code Map} and sets the values according to the provided data and team number.
   * 
   * @param data Map of the values to fill the {@code CoordinateMap} object.
   * @param team Team number used to select the right color of coordinates.
   */
  public CoordinateMap(Map data, int team) {
    if ((long) data.get("RedTeam") == team) {
      // Set the team coordinates
      StartCorner = (long) data.get("RedCorner");
      LL_x = (long) data.get("Red_LL_x");
      LL_y = (long) data.get("Red_LL_y");
      UR_x = (long) data.get("Red_UR_x");
      UR_y = (long) data.get("Red_UR_y");
      TN_LL_x = (long) data.get("TNR_LL_x");
      TN_LL_y = (long) data.get("TNR_LL_y");
      TN_UR_x = (long) data.get("TNR_UR_x");
      TN_UR_y = (long) data.get("TNR_UR_y");
      T_x = (long) data.get("TR_x");
      T_y = (long) data.get("TR_y");

      // Set the other team's coordinates
      StartCorner_o = (long) data.get("GreenCorner");
      LL_x_o = (long) data.get("Green_LL_x");
      LL_y_o = (long) data.get("Green_LL_y");
      UR_x_o = (long) data.get("Green_UR_x");
      UR_y_o = (long) data.get("Green_UR_y");
      TN_LL_x_o = (long) data.get("TNG_LL_x");
      TN_LL_y_o = (long) data.get("TNG_LL_y");
      TN_UR_x_o = (long) data.get("TNG_UR_x");
      TN_UR_y_o = (long) data.get("TNG_UR_y");
      T_x_o = (long) data.get("TG_x");
      T_y_o = (long) data.get("TG_y");
    } else if ((long) data.get("GreenTeam") == team) {
      // Set the team coordinates
      StartCorner = (long) data.get("GreenCorner");
      LL_x = (long) data.get("Green_LL_x");
      LL_y = (long) data.get("Green_LL_y");
      UR_x = (long) data.get("Green_UR_x");
      UR_y = (long) data.get("Green_UR_y");
      TN_LL_x = (long) data.get("TNG_LL_x");
      TN_LL_y = (long) data.get("TNG_LL_y");
      TN_UR_x = (long) data.get("TNG_UR_x");
      TN_UR_y = (long) data.get("TNG_UR_y");
      T_x = (long) data.get("TG_x");
      T_y = (long) data.get("TG_y");

      // Set the other team's coordinates
      StartCorner_o = (long) data.get("RedCorner");
      LL_x_o = (long) data.get("Red_LL_x");
      LL_y_o = (long) data.get("Red_LL_y");
      UR_x_o = (long) data.get("Red_UR_x");
      UR_y_o = (long) data.get("Red_UR_y");
      TN_LL_x_o = (long) data.get("TNR_LL_x");
      TN_LL_y_o = (long) data.get("TNR_LL_y");
      TN_UR_x_o = (long) data.get("TNR_UR_x");
      TN_UR_y_o = (long) data.get("TNR_UR_y");
      T_x_o = (long) data.get("TR_x");
      T_y_o = (long) data.get("TR_y");
    }

    I_LL_x = (long) data.get("Island_LL_x");
    I_LL_y = (long) data.get("Island_LL_y");
    I_UR_x = (long) data.get("Island_UR_x");
    I_UR_y = (long) data.get("Island_UR_y");
  }

}
