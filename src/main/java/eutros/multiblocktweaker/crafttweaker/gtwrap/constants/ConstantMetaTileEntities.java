package eutros.multiblocktweaker.crafttweaker.gtwrap.constants;

import crafttweaker.annotations.ZenRegister;
import eutros.multiblocktweaker.crafttweaker.gtwrap.impl.MCMetaTileEntity;
import eutros.multiblocktweaker.crafttweaker.gtwrap.interfaces.IMetaTileEntity;
import gregtech.common.metatileentities.MetaTileEntities;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenProperty;

import java.util.Arrays;

@ZenClass("mods.gregtech.MetaTileEntities")
@ZenRegister
public class ConstantMetaTileEntities {

    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_BOILER_COAL_BRONZE = new MCMetaTileEntity(MetaTileEntities.STEAM_BOILER_COAL_BRONZE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_BOILER_COAL_STEEL = new MCMetaTileEntity(MetaTileEntities.STEAM_BOILER_COAL_STEEL);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_BOILER_SOLAR_BRONZE = new MCMetaTileEntity(MetaTileEntities.STEAM_BOILER_SOLAR_BRONZE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_BOILER_LAVA_BRONZE = new MCMetaTileEntity(MetaTileEntities.STEAM_BOILER_LAVA_BRONZE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_BOILER_LAVA_STEEL = new MCMetaTileEntity(MetaTileEntities.STEAM_BOILER_LAVA_STEEL);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_EXTRACTOR_BRONZE = new MCMetaTileEntity(MetaTileEntities.STEAM_EXTRACTOR_BRONZE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_EXTRACTOR_STEEL = new MCMetaTileEntity(MetaTileEntities.STEAM_EXTRACTOR_STEEL);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_MACERATOR_BRONZE = new MCMetaTileEntity(MetaTileEntities.STEAM_MACERATOR_BRONZE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_MACERATOR_STEEL = new MCMetaTileEntity(MetaTileEntities.STEAM_MACERATOR_STEEL);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_COMPRESSOR_BRONZE = new MCMetaTileEntity(MetaTileEntities.STEAM_COMPRESSOR_BRONZE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_COMPRESSOR_STEEL = new MCMetaTileEntity(MetaTileEntities.STEAM_COMPRESSOR_STEEL);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_HAMMER_BRONZE = new MCMetaTileEntity(MetaTileEntities.STEAM_HAMMER_BRONZE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_HAMMER_STEEL = new MCMetaTileEntity(MetaTileEntities.STEAM_HAMMER_STEEL);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_FURNACE_BRONZE = new MCMetaTileEntity(MetaTileEntities.STEAM_FURNACE_BRONZE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_FURNACE_STEEL = new MCMetaTileEntity(MetaTileEntities.STEAM_FURNACE_STEEL);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_ALLOY_SMELTER_BRONZE = new MCMetaTileEntity(MetaTileEntities.STEAM_ALLOY_SMELTER_BRONZE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEAM_ALLOY_SMELTER_STEEL = new MCMetaTileEntity(MetaTileEntities.STEAM_ALLOY_SMELTER_STEEL);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity MAGIC_ENERGY_ABSORBER = new MCMetaTileEntity(MetaTileEntities.MAGIC_ENERGY_ABSORBER);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity COKE_OVEN_HATCH = new MCMetaTileEntity(MetaTileEntities.COKE_OVEN_HATCH);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity PRIMITIVE_BLAST_FURNACE = new MCMetaTileEntity(MetaTileEntities.PRIMITIVE_BLAST_FURNACE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity COKE_OVEN = new MCMetaTileEntity(MetaTileEntities.COKE_OVEN);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity ELECTRIC_BLAST_FURNACE = new MCMetaTileEntity(MetaTileEntities.ELECTRIC_BLAST_FURNACE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity VACUUM_FREEZER = new MCMetaTileEntity(MetaTileEntities.VACUUM_FREEZER);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity IMPLOSION_COMPRESSOR = new MCMetaTileEntity(MetaTileEntities.IMPLOSION_COMPRESSOR);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity PYROLYSE_OVEN = new MCMetaTileEntity(MetaTileEntities.PYROLYSE_OVEN);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity DISTILLATION_TOWER = new MCMetaTileEntity(MetaTileEntities.DISTILLATION_TOWER);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity CRACKER = new MCMetaTileEntity(MetaTileEntities.CRACKER);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity MULTI_FURNACE = new MCMetaTileEntity(MetaTileEntities.MULTI_FURNACE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity DIESEL_ENGINE = new MCMetaTileEntity(MetaTileEntities.LARGE_COMBUSTION_ENGINE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity LARGE_STEAM_TURBINE = new MCMetaTileEntity(MetaTileEntities.LARGE_STEAM_TURBINE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity LARGE_GAS_TURBINE = new MCMetaTileEntity(MetaTileEntities.LARGE_GAS_TURBINE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity LARGE_PLASMA_TURBINE = new MCMetaTileEntity(MetaTileEntities.LARGE_PLASMA_TURBINE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity LARGE_BRONZE_BOILER = new MCMetaTileEntity(MetaTileEntities.LARGE_BRONZE_BOILER);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity LARGE_STEEL_BOILER = new MCMetaTileEntity(MetaTileEntities.LARGE_STEEL_BOILER);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity LARGE_TITANIUM_BOILER = new MCMetaTileEntity(MetaTileEntities.LARGE_TITANIUM_BOILER);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity LARGE_TUNGSTENSTEEL_BOILER = new MCMetaTileEntity(MetaTileEntities.LARGE_TUNGSTENSTEEL_BOILER);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity LOCKED_SAFE = new MCMetaTileEntity(MetaTileEntities.LOCKED_SAFE);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity WOODEN_TANK = new MCMetaTileEntity(MetaTileEntities.WOODEN_TANK);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity BRONZE_TANK = new MCMetaTileEntity(MetaTileEntities.BRONZE_TANK);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STEEL_TANK = new MCMetaTileEntity(MetaTileEntities.STEEL_TANK);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity STAINLESS_STEEL_TANK = new MCMetaTileEntity(MetaTileEntities.STAINLESS_STEEL_TANK);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity TITANIUM_TANK = new MCMetaTileEntity(MetaTileEntities.TITANIUM_TANK);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity TUNGSTENSTEEL_TANK = new MCMetaTileEntity(MetaTileEntities.TUNGSTENSTEEL_TANK);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity WORKBENCH = new MCMetaTileEntity(MetaTileEntities.WORKBENCH);

    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] HULL = Arrays.stream(MetaTileEntities.HULL).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] TRANSFORMER = Arrays.stream(MetaTileEntities.TRANSFORMER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] CHARGER = Arrays.stream(MetaTileEntities.CHARGER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] ELECTRIC_FURNACE = Arrays.stream(MetaTileEntities.ELECTRIC_FURNACE).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] MACERATOR = Arrays.stream(MetaTileEntities.MACERATOR).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] ALLOY_SMELTER = Arrays.stream(MetaTileEntities.ALLOY_SMELTER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] ARC_FURNACE = Arrays.stream(MetaTileEntities.ARC_FURNACE).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] ASSEMBLER = Arrays.stream(MetaTileEntities.ASSEMBLER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] AUTOCLAVE = Arrays.stream(MetaTileEntities.AUTOCLAVE).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] BENDER = Arrays.stream(MetaTileEntities.BENDER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] BREWERY = Arrays.stream(MetaTileEntities.BREWERY).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] CANNER = Arrays.stream(MetaTileEntities.CANNER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] CENTRIFUGE = Arrays.stream(MetaTileEntities.CENTRIFUGE).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] CHEMICAL_BATH = Arrays.stream(MetaTileEntities.CHEMICAL_BATH).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] CHEMICAL_REACTOR = Arrays.stream(MetaTileEntities.CHEMICAL_REACTOR).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] COMPRESSOR = Arrays.stream(MetaTileEntities.COMPRESSOR).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] CUTTER = Arrays.stream(MetaTileEntities.CUTTER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] DISTILLERY = Arrays.stream(MetaTileEntities.DISTILLERY).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] ELECTROLYZER = Arrays.stream(MetaTileEntities.ELECTROLYZER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] ELECTROMAGNETIC_SEPARATOR = Arrays.stream(MetaTileEntities.ELECTROMAGNETIC_SEPARATOR).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] EXTRACTOR = Arrays.stream(MetaTileEntities.EXTRACTOR).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] EXTRUDER = Arrays.stream(MetaTileEntities.EXTRUDER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] FERMENTER = Arrays.stream(MetaTileEntities.FERMENTER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] FLUID_HEATER = Arrays.stream(MetaTileEntities.FLUID_HEATER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] FLUID_SOLIDIFIER = Arrays.stream(MetaTileEntities.FLUID_SOLIDIFIER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] FORGE_HAMMER = Arrays.stream(MetaTileEntities.FORGE_HAMMER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] FORMING_PRESS = Arrays.stream(MetaTileEntities.FORMING_PRESS).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] LATHE = Arrays.stream(MetaTileEntities.LATHE).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] MIXER = Arrays.stream(MetaTileEntities.MIXER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] ORE_WASHER = Arrays.stream(MetaTileEntities.ORE_WASHER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] PACKER = Arrays.stream(MetaTileEntities.PACKER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] UNPACKER = Arrays.stream(MetaTileEntities.UNPACKER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] POLARIZER = Arrays.stream(MetaTileEntities.POLARIZER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] LASER_ENGRAVER = Arrays.stream(MetaTileEntities.LASER_ENGRAVER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] SIFTER = Arrays.stream(MetaTileEntities.SIFTER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] THERMAL_CENTRIFUGE = Arrays.stream(MetaTileEntities.THERMAL_CENTRIFUGE).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] WIREMILL = Arrays.stream(MetaTileEntities.WIREMILL).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] DIESEL_GENERATOR = Arrays.stream(MetaTileEntities.COMBUSTION_GENERATOR).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] STEAM_TURBINE = Arrays.stream(MetaTileEntities.STEAM_TURBINE).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] GAS_TURBINE = Arrays.stream(MetaTileEntities.GAS_TURBINE).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] ITEM_IMPORT_BUS = Arrays.stream(MetaTileEntities.ITEM_IMPORT_BUS).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] ITEM_EXPORT_BUS = Arrays.stream(MetaTileEntities.ITEM_EXPORT_BUS).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] FLUID_IMPORT_HATCH = Arrays.stream(MetaTileEntities.FLUID_IMPORT_HATCH).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] FLUID_EXPORT_HATCH = Arrays.stream(MetaTileEntities.FLUID_EXPORT_HATCH).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] ENERGY_INPUT_HATCH = Arrays.stream(MetaTileEntities.ENERGY_INPUT_HATCH).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] ENERGY_OUTPUT_HATCH = Arrays.stream(MetaTileEntities.ENERGY_OUTPUT_HATCH).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] ROTOR_HOLDER = Arrays.stream(MetaTileEntities.ROTOR_HOLDER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] PUMP = Arrays.stream(MetaTileEntities.PUMP).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] BLOCK_BREAKER = Arrays.stream(MetaTileEntities.BLOCK_BREAKER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] AIR_COLLECTOR = Arrays.stream(MetaTileEntities.GAS_COLLECTOR).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] ITEM_COLLECTOR = Arrays.stream(MetaTileEntities.ITEM_COLLECTOR).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] QUANTUM_CHEST = Arrays.stream(MetaTileEntities.QUANTUM_CHEST).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] QUANTUM_TANK = Arrays.stream(MetaTileEntities.QUANTUM_TANK).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);
    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[] FISHER = Arrays.stream(MetaTileEntities.FISHER).map(MCMetaTileEntity::new).toArray(IMetaTileEntity[]::new);

    /**
     *
     */
    @ZenProperty
    public static final IMetaTileEntity[][] BATTERY_BUFFER = Arrays.stream(MetaTileEntities.BATTERY_BUFFER).map(Arrays::stream).map(s -> s.map(MCMetaTileEntity::new)).map(s -> s.toArray(IMetaTileEntity[]::new)).toArray(IMetaTileEntity[][]::new);

}
