package me.MorcCrafak.Hack;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;



public class main extends JavaPlugin{ // main classa extendnuta o Java Plugin na funkciu v serveri

	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args){
		
		Player player = (Player) sender; // nastav� player instanciu na kick atd...
		  if(commandlabel.equalsIgnoreCase("hack")){ // zistuje ci hrac napisal prikaz
			  if(player.hasPermission("MorcCrafak.hack")){
			  if(args.length == 0) {
				  player.kickPlayer("Vypni hacky nebo dostaneš ban!");
			  }else if(args.length == 1) {
				  Player victim = player.getServer().getPlayer(args[0]);
				  victim.kickPlayer("Vypni hacky nebo dostaneš ban!");
				  player.sendMessage(ChatColor.GREEN + victim.getName() + " has been successfully kicked!");
			  }

			}
		}else{
			player.sendMessage(ChatColor.RED + "You don't have permission for this!");
		}
		return false;
		}
				
	

	}
