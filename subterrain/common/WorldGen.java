package lolinder.subterrain.common;

import java.util.Random;

import lolinder.subterrain.common.blocks.ModBlocks;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import net.minecraft.src.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {

	private WorldGenerator bitOreGen = new WorldGenMinable(ModBlocks.oreBitumen.blockID, 8);
	
	public WorldGen() {	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case -1 : generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0 : generateOverworld(world, random, chunkX * 16, chunkZ * 16);
		default : break;
		}

	}

	private void generateOverworld(World world, Random random, int blockX, int blockZ) {
		genStandardOre(2, bitOreGen, world, 0, 32, blockX, blockZ, random);
	}

	private void generateNether(World world, Random random, int blockX, int blockZ) {
		
	}
	
	protected void genStandardOre(int numberOfOres, WorldGenerator generator, World world, int minHeight, int maxHeight, int blockX, int blockZ, Random random)
    {
        for (int i = 0; i < numberOfOres; ++i)
        {
    		int Xcoord = blockX + random.nextInt(16);
    		int Ycoord = random.nextInt(60);
    		int Zcoord = blockZ + random.nextInt(16);
            generator.generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }

}
