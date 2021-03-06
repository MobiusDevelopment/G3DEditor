/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package g3deditor.exceptions;

import java.io.File;

/**
 * <a href="http://l2j-server.com/">L2jServer</a>
 * 
 * @author Forsaiken aka Patrick, e-mail: patrickbiesenbach@yahoo.de
 */
public final class GeoFileLoadException extends RuntimeException
{
	public GeoFileLoadException(final File file, final boolean l2j, final String couse)
	{
		super("Failed loading Geo File " + (l2j ? "L2j" : "L2Off") + " '" + file + "', " + couse);
	}
	
	public GeoFileLoadException(final File file, final boolean l2j, final Exception couse)
	{
		super("Failed loading Geo File " + (l2j ? "L2j" : "L2Off") + " '" + file + "', " + couse.getMessage());
	}
}