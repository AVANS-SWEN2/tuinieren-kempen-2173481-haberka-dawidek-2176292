import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class TuinDomotica {
	private boolean daglicht;
	private boolean regen;
	private Schakelaar slimmeschakelaar;
	private Sproeier slangetje;
	private Verlichting licht;

	public TuinDomotica() {
		super();
		setSlimmeschakelaar(Schakelaar.AUTOMATISCH);
		this.slangetje = new Sproeier();
		this.licht = new Verlichting();
	}

	public Boolean getDaglicht() {
		return daglicht;
	}

	public Boolean getRegen() {
		return regen;
	}

	public void setRegen(Boolean regen) {
		this.regen = regen;
		if (this.slimmeschakelaar == Schakelaar.AUTOMATISCH)
			this.slangetje.sproeien(!regen);
	}

	public Schakelaar getSlimmeschakelaar() {
		return slimmeschakelaar;
	}

	public void setSlimmeschakelaar(Schakelaar slimmeschakelaar) {
		this.slimmeschakelaar = slimmeschakelaar;
		switch (slimmeschakelaar) {
		case AAN:
			this.slangetje.sproeien(true);
			this.licht.setLicht(true);
			break;
		case UIT:
			this.slangetje.sproeien(false);
			this.licht.setLicht(false);
		case AUTOMATISCH:
			break;
		}
	}

	public Verlichting getLicht() {
		return licht;
	}

	public Sproeier getSlangetje() {
		return slangetje;
	}

	public void activate() {
		Timer timer = new Timer();
		Calendar today = Calendar.getInstance();
		today.set(Calendar.HOUR_OF_DAY, 20);
		today.set(Calendar.MINUTE, 0);
		today.set(Calendar.SECOND, 0);
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (slimmeschakelaar != Schakelaar.AUTOMATISCH)
					return;
				licht.setLicht(true);
				slangetje.sproeien(false);
			}
		}, today.getTime(), TimeUnit.DAYS.toMillis(1));
		today.set(Calendar.HOUR_OF_DAY, 5);
		today.set(Calendar.MINUTE, 0);
		today.set(Calendar.SECOND, 0);
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (slimmeschakelaar != Schakelaar.AUTOMATISCH)
					return;
				licht.setLicht(false);
				if (!regen)
					slangetje.sproeien(false);
			}
		}, today.getTime(), TimeUnit.DAYS.toMillis(1));
	}
}
