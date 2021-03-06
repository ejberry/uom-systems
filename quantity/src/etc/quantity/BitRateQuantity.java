/**
 * Unit-API - Units of Quantity API for Java
 * Copyright (c) 2014 Jean-Marie Dautelle, Werner Keil, V2COM
 * All rights reserved.
 *
 * See LICENSE.txt for details.
 */
package systems.uom.test.quantity;

import javax.measure.Quantity;
import javax.measure.Unit;

import systems.uom.quantity.InformationRate;
import systems.uom.test.unit.BitRateUnit;

/**
 * @author Werner Keil
 * @version 0.6
 */
public class BitRateQuantity extends TestQuantity<InformationRate> {
	public BitRateQuantity() {
		super(InformationRate.class);
	}

	public BitRateQuantity(double val, BitRateUnit un) {
		this();
		units = val;
		unit = un;
		scalar = val * unit.getMultFactor();
	}

	public BitRateQuantity add(BitRateQuantity d1) {
		BitRateQuantity dn = new BitRateQuantity();
		Object o = super.add(dn, this, d1, BitRateUnit.REF_UNIT);
		return (BitRateQuantity) o;
	}

	public BitRateQuantity subtract(BitRateQuantity d1) {
		BitRateQuantity dn = new BitRateQuantity();
		Object o = super.subtract(dn, this, d1, BitRateUnit.REF_UNIT);
		return (BitRateQuantity) o;
	}

	public boolean eq(BitRateQuantity d1) {
		return super.eq(d1);
	}

	public boolean ne(BitRateQuantity d1) {
		return super.ne(d1);
	}

	public boolean gt(BitRateQuantity d1) {
		return super.gt(d1);
	}

	public boolean lt(BitRateQuantity d1) {
		return super.lt(d1);
	}

	public boolean ge(BitRateQuantity d1) {
		return super.ge(d1);
	}

	public boolean le(BitRateQuantity d1) {
		return super.le(d1);
	}

	public BitRateQuantity multiply(double v) {
		return new BitRateQuantity(units * v, (BitRateUnit) unit);
	}

	public BitRateQuantity divide(double v) {
		return new BitRateQuantity(units / v, (BitRateUnit) unit);
	}

	// mixed type operations

	// public DistanceQuantity divide(DistanceQuantity d1) {
	// BitRateQuantity dq0 = convert(AreaUnit.sqmetre);
	// DistanceQuantity dq1 = d1.convert(DistanceUnit.m);
	// return new DistanceQuantity(dq0.units / dq1.units, DistanceUnit.m);
	// }
	// public VolumeQuantity multiply(DistanceQuantity d1) {
	// BitRateQuantity dq0 = convert(BitRateUnit.bps);
	// DistanceQuantity dq1 = d1.convert(DistanceUnit.m);
	// return new VolumeQuantity(dq0.units * dq1.units, VolumeUnit.cumetre);
	// }

	public BitRateQuantity convert(BitRateUnit newUnit) {
		return new BitRateQuantity(scalar / newUnit.getMultFactor(), newUnit);
	}

	public String showInUnits(BitRateUnit u, int precision) {
		return super.showInUnits(u, precision);
	}

    public Quantity<?> divide(Quantity<?> that) {
		// TODO Auto-generated method stub
		return null;
	}


    public Quantity<InformationRate> subtract(Quantity<InformationRate> that) {
		// TODO Auto-generated method stub
		return null;
	}


    public Quantity<InformationRate> add(Quantity<InformationRate> that) {
		// TODO Auto-generated method stub
		return null;
	}


    public Quantity<InformationRate> divide(Number that) {
		// TODO Auto-generated method stub
		return null;
	}


    public Quantity<InformationRate> inverse() {
		// TODO Auto-generated method stub
		return null;
	}

    public Quantity<InformationRate> multiply(Number that) {
		// TODO Auto-generated method stub
		return null;
	}


    public Quantity<InformationRate> to(Unit<InformationRate> unit) {
		// TODO Auto-generated method stub
		return null;
	}

    public Quantity<?> multiply(Quantity<?> that) {
		// TODO Auto-generated method stub
		return null;
	}
    
	@SuppressWarnings("unchecked")
	public final <T extends Quantity<T>> Quantity<T> asType(
			Class<T> type) throws ClassCastException {
		this.getUnit().asType(type); // Raises ClassCastException is dimension mismatches.
		return (Quantity<T>) this;
	}
}
